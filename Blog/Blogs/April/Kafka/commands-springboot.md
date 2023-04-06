# Spring boot 


## Order Class

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String itemName;
    private int qty;
    private double price;

    @Override
    public String toString() {
        return "{" +
                "\"itemName\"" + ":\"" + itemName + '"' +
                ", \"qty\":" + qty +
                ", \"price\":" + price +
                '}';
    }
}
```
Example

```json
{
    "itemName": "badge",
    "qty": 100,
    "price": 500.00
}
```
## OrderEvent

```java
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String message;
    private String status;
    private Order order;
}
```
Example

```json
{
    
    "message":"order status is pending state",
    "status":"PENDING",
    "order":
    {
        "itemName":"badge",
        "qty":100,
        "price":500.0
    }
}

```
---

# order-service 

1. application.properties

```
spring.kafka.producer.bootstrap-servers:localhost:9092
spring.kafka.producer.key-serializer: org.apache.kafka.common.serialization.StringSerializer
spring.kafka.producer.value-serializer: org.springframework.kafka.support.serializer.JsonSerializer
spring.kafka.topic.name: ordertopic
```


2. KafkaTopic configuration

```java
@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    //Spring bean
    @Bean
    public NewTopic topic()
    {
        return TopicBuilder.name(topicName).build();
//        return TopicBuilder.name(topicName).partitions(3).build();
    }
}
```

3. OrderProducer Class

```java
@Service
public class OrderProducer {
    @Autowired
    private NewTopic topic;

    private KafkaTemplate<String, Order> kafkaTemplate;

    /**
     Constructor
     */
    public OrderProducer(NewTopic topic, KafkaTemplate<String, Order> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }


    /**
     Send Message to Kafka
     */
    public void sendMessage(OrderEvent event)
    {
        System.out.println("Order sent ==> "+event.toString());
        Message<OrderEvent> message= MessageBuilder.withPayload(event).setHeader(KafkaHeaders.TOPIC,topic.name()).build();
        kafkaTemplate.send(message);
    }
}

```

4. OrderController

```java
@RestController
@RequestMapping("/api/v1")
public class OrderController {
    private OrderProducer orderProducer;

    /**
     * Constructor
     * @param orderProducer
     */
    public OrderController( OrderProducer orderProducer)
    {
        this.orderProducer=orderProducer;
    }

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order)
    {
        order.setOrderId(UUID.randomUUID().toString());
        OrderEvent orderEvent= new OrderEvent();
        orderEvent.setStatus("PENDING");
        orderEvent.setMessage("order status is pending state");
        orderEvent.setOrder(order);
        orderProducer.sendMessage(orderEvent);
        return "Success, placed order.";
    }
}
```

---

# Inventory Service

1. Structure of Order:

```java
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String message;
    private String status;
    private String orderId;
    private String itemName;
    private int qty;
    private double price;
}
```
2. application.properties

```shell
server.port=8083

#Kafka
spring.kafka.consumer.bootstrap-servers: localhost:9092
spring.kafka.consumer.group-id: transactions
spring.kafka.consumer.auto-offset-reset: earliest
spring.kafka.consumer.key-deserializer: org.apache.kafka.common.serialization.StringDeserializer
spring.kafka.consumer.value-deserializer: org.springframework.kafka.support.serializer.JsonDeserializer
spring.kafka.consumer.properties.spring.json.trusted.packages=*
spring.kafka.topic.name=ordertopic

# Postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/ordertransaction
spring.datasource.username=***
spring.datasource.password=***
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

3. Kafka Consumer

```java
@Service
public class TransactionConsumer {

    @Autowired
    private TransactionRepo transactionRepo;

    @KafkaListener(topics = {"${spring.kafka.topic.name}"},groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent event)
    {
 
        Orders orders=new Orders();
        orders.setOrderId(event.getOrder().getOrderId());
        orders.setStatus(event.getStatus());
        orders.setMessage(event.getMessage());
        orders.setPrice(event.getOrder().getPrice());
        orders.setQty(event.getOrder().getQty());
        orders.setItemName(event.getOrder().getItemName());

        transactionRepo.save(orders);
    }
}
```