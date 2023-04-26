### What is Hadoop ?

Hadoop is an open-source software framework for distributed storage and processing of large data sets. It was designed to handle big data, which is data that is too large or complex to be processed by traditional data processing systems. Hadoop allows for the distributed processing of large data sets across clusters of commodity computers using a simple programming model.

Hadoop consists of two main components: the Hadoop Distributed File System (HDFS) and MapReduce. HDFS is a distributed file system that provides high-throughput access to application data. MapReduce is a programming model and software framework for writing applications that can process vast amounts of data in parallel across a large number of nodes in a Hadoop cluster.

Hadoop is used by many organizations to process and analyze large amounts of data, including companies in the financial services, healthcare, and retail industries. It has become an important tool in the field of big data analytics and is widely used for tasks such as data warehousing, data mining, and machine learning.

### What is Python ?

Python is a high-level, interpreted programming language that was first released in 1991 by Guido van Rossum. It is known for its simplicity, ease of use, and readability, and has become one of the most popular programming languages in the world.

Python is designed to be easy to learn and use, making it a popular language for beginners and experienced programmers alike. It has a simple syntax that emphasizes readability, which means that it is easy to understand and write. Python also has a large standard library that provides developers with many tools and modules for common tasks, such as working with files, networking, and data processing.

Python is used in a wide variety of applications, including web development, scientific computing, data analysis, artificial intelligence, and machine learning. It is often used in combination with other technologies, such as Django or Flask for web development, or NumPy and Pandas for data analysis. Because of its popularity and versatility, Python is considered one of the most important programming languages to know in today's job market.



### Python Datatype:


Text Type:	str
Numeric Types:	int, float, complex
Sequence Types:	list, tuple, range
Mapping Type:	dict
Set Types:	set, frozenset
Boolean Type:	bool
Binary Types:	bytes, bytearray, memoryview
None Type:	NoneType



|Operator	|Name	|Example|
|-|-|-|
|+	|Addition	|x + y	
|-	|Subtraction	|x - y	
|*	|Multiplication|	x * y	
|/	|Division	|x / y	
|%	|Modulus	|x % y	
|**	|Exponentiation|	x ** y	
|//	|Floor division|	x // y




# Data Structures

## List

```py
## List
mylist = ["apple", "banana", "cherry"]

thislist = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]

## access list
print(thislist[2:5])


## change item
thislist = ["apple", "banana", "cherry"]
thislist[1] = "blackcurrant"
print(thislist)

## add item to list
thislist.append("orange")


thislist = ["apple", "banana", "cherry"]
thislist.insert(1, "orange")

## remove
thislist = ["apple", "banana", "cherry"]
thislist.remove("banana")

thislist = ["apple", "banana", "cherry"]
thislist.pop(1)

## Loop list
thislist = ["apple", "banana", "cherry"]
for x in thislist:
  print(x)

thislist = ["apple", "banana", "cherry"]
for i in range(len(thislist)):
  print(thislist[i])

## Sort
thislist = ["orange", "mango", "kiwi", "pineapple", "banana"]
thislist.sort()
print(thislist)

### decending
thislist = ["orange", "mango", "kiwi", "pineapple", "banana"]
thislist.sort(reverse = True)
print(thislist)


### Reverse
thislist = ["banana", "Orange", "Kiwi", "cherry"]
thislist.reverse()
print(thislist)



```

## Set
- Set items are unordered, unchangeable, and do not allow duplicate values.


```py
thisset = {"apple", "banana", "cherry"}
print(thisset)

## Access set
thisset = {"apple", "banana", "cherry"}

for x in thisset:
  print(x)

## Add element to set
thisset = {"apple", "banana", "cherry"}
thisset.add("orange")
print(thisset)



```

## Python Conditions and If statements

Python supports the usual logical conditions from mathematics:

- Equals: a == b
- Not Equals: a != b
- Less than: a < b
- Less than or equal to: a <= b
- Greater than: a > b
- Greater than or equal to: a >= b
- These conditions can be used in several ways, most commonly in "if statements" and loops.



```py
a = 200
b = 33
if b > a:
  print("b is greater than a")
elif a == b:
  print("a and b are equal")
else:
  print("a is greater than b")
```

## While

```py
i = 1
while i < 6:
  print(i)
  i += 1

```

## For

```py
fruits = ["apple", "banana", "cherry"]
for x in fruits:
  print(x)
```


## Function

```py
def my_function():
  print("Hello from a function")

my_function()

# Argument

def my_function(fname):
  print(fname + " Refsnes")

my_function("Emil")
my_function("Tobias")

# unknown number of parameters
## If you do not know how many arguments that will be passed into your function, add a * before the parameter name in the function definition.



def my_function(*kids):
  print("The youngest child is " + kids[2])

my_function("Emil", "Tobias", "Linus")

## If you do not know how many keyword arguments that will be passed into your function, add two asterisk: ** before the parameter name in the function definition.

def my_function(**kid):
  print("His last name is " + kid["lname"])

my_function(fname = "Tobias", lname = "Refsnes")

```

## \_\_init\_\_ and self

In Python, \_\_init\_\_ is a special method used to initialize an instance of a class. It is called when an object is created from the class and allows you to define the attributes and behavior of the object.

The self parameter refers to the instance of the class that is being created. It is a convention to name this parameter self, but you can use any valid variable name instead.

Here is an example:

```py
class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
    
    def start(self):
        print("The car is starting.")

my_car = Car("Toyota", "Camry", 2020)
my_car.start()

```

In the example above, we define a Car class with an \_\_init\_\_ method that initializes the make, model, and year attributes of a car object. We also define a start method that simply prints a message.

To create an instance of the Car class, we call the class and pass in the required arguments. In this case, we create a car with make "Toyota", model "Camry", and year 2020. We then call the start method on the my_car instance of the Car class, which prints the message "The car is starting."





# Spark

Apache Spark is a distributed computing system designed to process large datasets in parallel across a cluster of computers. It is part of the Apache Hadoop ecosystem and provides a faster and more efficient alternative to MapReduce.

Spark allows you to write programs in a variety of languages including Python, Java, and Scala. It provides a high-level API that abstracts away the complexity of distributed computing, making it easier to write and manage big data applications.

Spark is particularly well-suited for iterative algorithms, such as machine learning and graph processing, due to its ability to store data in memory and its support for distributed data processing. It also has built-in support for SQL queries, streaming data, and graph processing.

One of the key features of Spark is its ability to perform in-memory computing, which means that data can be cached in memory and reused across multiple operations, reducing the amount of time spent reading and writing to disk. This makes Spark significantly faster than traditional batch processing systems like Hadoop MapReduce.

Overall, Spark is a powerful tool for processing large datasets in real-time and is widely used in the big data industry for a variety of applications including machine learning, data analysis, and stream processing.


# Tensorflow

TensorFlow is an open-source machine learning framework developed by Google. It is designed to enable developers to create and train machine learning models, particularly deep neural networks, for a variety of tasks such as image and speech recognition, natural language processing, and time series analysis.

The core component of TensorFlow is its computational graph, which allows developers to define mathematical operations and data flows in a graphical format. TensorFlow then optimizes and distributes the execution of these operations across multiple CPUs, GPUs, or even distributed clusters of computers, making it possible to train large, complex models on massive datasets.

TensorFlow supports a range of programming languages, including Python, C++, and Java, and provides high-level APIs for building and training models quickly and easily. Additionally, it offers lower-level APIs for more advanced users who want more control over the underlying operations and optimizations.

Some of the key features of TensorFlow include:

Support for distributed computing and GPUs, making it possible to train large, complex models quickly
A range of pre-built models and tools for common machine learning tasks, such as image and speech recognition
Integration with popular data analysis and machine learning libraries like NumPy and Scikit-learn
The ability to deploy models to a range of platforms, including mobile devices and the web
Overall, TensorFlow is a powerful tool for building and training machine learning models, particularly deep neural networks, and is widely used in the industry for a variety of applications.

```py
import tensorflow as tf
from tensorflow import keras
import numpy as np

# Define the model architecture
model = keras.Sequential([
    keras.layers.Flatten(input_shape=(28, 28)),
    keras.layers.Dense(128, activation='relu'),
    keras.layers.Dense(10, activation='softmax')
])

# Compile the model with a loss function, optimizer, and metric
model.compile(optimizer='adam',
              loss='sparse_categorical_crossentropy',
              metrics=['accuracy'])

# Load the MNIST dataset
mnist = keras.datasets.mnist
(train_images, train_labels), (test_images, test_labels) = mnist.load_data()

# Normalize the pixel values to be between 0 and 1
train_images = train_images / 255.0
test_images = test_images / 255.0

# Train the model
model.fit(train_images, train_labels, epochs=5)

# Evaluate the model on the test dataset
test_loss, test_acc = model.evaluate(test_images, test


#explaination
# In this example, we first import TensorFlow, Keras (a high-level API for building and training models in TensorFlow), and NumPy (a library for numerical computing in Python). We then define a simple neural network for image classification using the Sequential API in Keras. The network consists of an input layer (Flatten), a hidden layer (Dense with 128 neurons and a ReLU activation function), and an output layer (Dense with 10 neurons and a softmax activation function). We compile the model with an optimizer (adam), a loss function (sparse_categorical_crossentropy), and a metric (accuracy). We then load the MNIST dataset, which consists of 28x28 pixel images of handwritten digits (0-9). We normalize the pixel values to be between 0 and 1, and train the model on the training dataset for 5 epochs. Finally, we evaluate the model on the test dataset and print the accuracy.
```


# Keras

Keras is a high-level neural networks API that runs on top of TensorFlow (and other backend engines like Theano and CNTK). It provides an easy-to-use interface for building and training deep learning models.

Keras was developed with a focus on enabling fast experimentation and prototyping, while still being powerful enough for production use. It provides a range of built-in layers, activations, loss functions, and optimizers, making it easy to build and customize deep learning models for a variety of tasks, such as image classification, natural language processing, and time series forecasting.

Some of the key features of Keras include:

- User-friendly API: Keras provides a simple, intuitive interface that allows developers to quickly prototype and test deep learning models.
- Modular architecture: Keras is designed with a modular architecture that allows developers to easily mix and match different components of a deep learning model.
- Customizability: Keras provides a range of built-in layers, activations, loss functions, and optimizers, but also allows developers to define their own custom components.
- Compatibility: Keras is compatible with a range of backend engines, including TensorFlow, Theano, and CNTK, allowing developers to choose the engine that best fits their needs.
- Support for transfer learning: Keras provides support for transfer learning, which allows developers to leverage pre-trained models for their own tasks, even if the pre-trained models were trained on a different dataset

## Basic examples of using Keras to build and train deep learning models:

### Example 1: Image Classification with Convolutional Neural Networks (CNNs)

```py
import tensorflow as tf
from tensorflow import keras

# Load the CIFAR-10 dataset
(x_train, y_train), (x_test, y_test) = keras.datasets.cifar10.load_data()

# Normalize the pixel values to be between 0 and 1
x_train = x_train / 255.0
x_test = x_test / 255.0

# Define the model architecture
model = keras.Sequential([
    keras.layers.Conv2D(32, (3, 3), activation='relu', input_shape=(32, 32, 3)),
    keras.layers.MaxPooling2D((2, 2)),
    keras.layers.Conv2D(64, (3, 3), activation='relu'),
    keras.layers.MaxPooling2D((2, 2)),
    keras.layers.Conv2D(64, (3, 3), activation='relu'),
    keras.layers.Flatten(),
    keras.layers.Dense(64, activation='relu'),
    keras.layers.Dense(10, activation='softmax')
])

# Compile the model with a loss function, optimizer, and metric
model.compile(optimizer='adam',
              loss='sparse_categorical_crossentropy',
              metrics=['accuracy'])

# Train the model
model.fit(x_train, y_train, epochs=10, validation_data=(x_test, y_test))

```
In this example, we first import TensorFlow and Keras, and load the CIFAR-10 dataset, which consists of 32x32 pixel images in 10 different classes.

We normalize the pixel values to be between 0 and 1, and define a simple CNN architecture using the Sequential API in Keras. The network consists of 3 convolutional layers, each followed by a max pooling layer, a flatten layer, and 2 dense layers.

We compile the model with an optimizer (adam), a loss function (sparse_categorical_crossentropy), and a metric (accuracy), and train the model on the training dataset for 10 epochs

### Example 2: Sentiment Analysis with Recurrent Neural Networks (RNNs)

```py
import tensorflow as tf
from tensorflow import keras

# Load the IMDB dataset
(x_train, y_train), (x_test, y_test) = keras.datasets.imdb.load_data(num_words=10000)

# Pad the sequences to be the same length
x_train = keras.preprocessing.sequence.pad_sequences(x_train, maxlen=200)
x_test = keras.preprocessing.sequence.pad_sequences(x_test, maxlen=200)

# Define the model architecture
model = keras.Sequential([
    keras.layers.Embedding(10000, 32),
    keras.layers.LSTM(32),
    keras.layers.Dense(1, activation='sigmoid')
])

# Compile the model with a loss function, optimizer, and metric
model.compile(optimizer='adam',
              loss='binary_crossentropy',
              metrics=['accuracy'])

# Train the model
model.fit(x_train, y_train, epochs=10, validation_data=(x_test, y_test))

```

In this example, we first import TensorFlow and Keras, and load the IMDB dataset, which consists of movie reviews labeled as positive or negative.

We pad the sequences to be the same length (200) and define a simple RNN architecture using the Sequential API in Keras. The network consists of an embedding layer, an LSTM layer, and a dense layer with a sigmoid activation function.



# Pytorch

PyTorch is an open-source machine learning library based on the Torch library. It is primarily developed by Facebook's AI Research (FAIR) team, but is also maintained by a community of contributors.

PyTorch is designed to be flexible and dynamic, allowing developers to build and train machine learning models with ease. It provides a range of tools for building and training neural networks, including:

Tensors: PyTorch provides a powerful n-dimensional array object called a tensor, which is the fundamental building block of PyTorch computations.
Automatic differentiation: PyTorch allows developers to define and train computational graphs dynamically, using a technique called automatic differentiation. This enables developers to easily implement complex models that require non-linear operations.
Neural network modules: PyTorch provides a range of pre-built modules for building neural networks, including layers, activations, loss functions, and optimizers.
CUDA support: PyTorch provides support for running computations on GPUs, which can greatly speed up the training process.
PyTorch is also known for its ease of use and developer-friendly API. It provides a simple and intuitive interface for building and training machine learning models, making it a popular choice among researchers and developers alike.

Overall, PyTorch is a powerful and flexible machine learning library that is widely used in the industry and academia for a variety of applications.

## Examples of Pytorch

### Example 1: Image Classification with Convolutional Neural Networks (CNNs)

```py
import torch
import torch.nn as nn
import torch.optim as optim
import torchvision.datasets as datasets
import torchvision.transforms as transforms

# Define the device to use (GPU or CPU)
device = torch.device('cuda' if torch.cuda.is_available() else 'cpu')

# Load the CIFAR-10 dataset and apply data transformations
transform = transforms.Compose([
    transforms.ToTensor(),
    transforms.Normalize((0.5, 0.5, 0.5), (0.5, 0.5, 0.5))
])
train_dataset = datasets.CIFAR10(root='./data', train=True, download=True, transform=transform)
test_dataset = datasets.CIFAR10(root='./data', train=False, download=True, transform=transform)

# Define the model architecture
class CNN(nn.Module):
    def __init__(self):
        super(CNN, self).__init__()
        self.conv1 = nn.Conv2d(3, 16, 3, padding=1)
        self.conv2 = nn.Conv2d(16, 32, 3, padding=1)
        self.conv3 = nn.Conv2d(32, 64, 3, padding=1)
        self.pool = nn.MaxPool2d(2, 2)
        self.fc1 = nn.Linear(64 * 4 * 4, 256)
        self.fc2 = nn.Linear(256, 10)
        self.relu = nn.ReLU()
        self.dropout = nn.Dropout(p=0.5)

    def forward(self, x):
        x = self.relu(self.conv1(x))
        x = self.pool(self.relu(self.conv2(x)))
        x = self.pool(self.relu(self.conv3(x)))
        x = x.view(-1, 64 * 4 * 4)
        x = self.dropout(self.relu(self.fc1(x)))
        x = self.fc2(x)
        return x

# Instantiate the model and define the loss function and optimizer
model = CNN().to(device)
criterion = nn.CrossEntropyLoss()
optimizer = optim.Adam(model.parameters(), lr=0.001)

# Train the model
num_epochs = 10
batch_size = 64
train_loader = torch.utils.data.DataLoader(train_dataset, batch_size=batch_size, shuffle=True)
test_loader = torch.utils.data.DataLoader(test_dataset, batch_size=batch_size, shuffle=False)

for epoch in range(num_epochs):
    for i, (images, labels) in enumerate(train_loader):
        images = images.to(device)
        labels = labels.to(device)
        outputs = model(images)
        loss = criterion(outputs, labels)
        optimizer.zero_grad()
        loss.backward()
        optimizer.step()

    # Evaluate the model on the test set
    with torch.no_grad():
        correct = 0
        total = 0
        for images, labels in test_loader:
            images = images.to(device)
            labels = labels.to(device)
            outputs = model(images)
            _, predicted = torch.max(outputs.data, 1)
            total += labels.size(0)
            correct += (predicted == labels).sum().item()

    print(f'Epoch [{epoch+1}/{num_epochs}], Loss: {loss.item():.4f}, Accuracy: {(100 * correct / total):.2f}%')


```

we first import the necessary PyTorch modules and load the CIFAR-10 dataset, applying data transformations to normalize the pixel values. We define a simple CNN architecture using the nn.Module API in PyTorch

# CNN

A Convolutional Neural Network (CNN) is a type of neural network commonly used for image recognition and computer vision tasks. It is designed to automatically and adaptively learn spatial hierarchies of features from input images.

At a high level, a CNN consists of three main types of layers:

- Convolutional layers: These layers apply a set of learnable filters to the input image to extract features. The filters slide over the input image, performing element-wise multiplication with a local region of the input at a time, and the results are summed up to produce a feature map.

- Pooling layers: These layers reduce the spatial size of the feature maps, by taking the maximum or average value of each local region of the feature map. This helps to make the model more robust to variations in the input image, and also reduces the number of parameters in the model.

- Fully connected layers: These layers take the flattened output of the previous layers and use it to produce the final classification output. They are similar to the fully connected layers in a traditional neural network.

CNNs are known for their ability to learn features automatically, without the need for hand-engineering of features. This makes them particularly effective for tasks such as object recognition, where the features of interest can be complex and difficult to define. Additionally, CNNs have been shown to be effective in other domains such as natural language processing and speech recognition.

Overall, CNNs have revolutionized the field of computer vision and are widely used in industry and academia for a variety of applications.

## Loss calculation

In a CNN, the loss function is typically calculated using the softmax function and the cross-entropy loss. Here's how it works:

Softmax function: The output of the last layer in a CNN is typically a set of scores, where each score represents the probability of the input image belonging to a particular class. The softmax function is applied to these scores to convert them into a probability distribution that sums to 1.

Cross-entropy loss: Once the scores have been converted into probabilities using the softmax function, the cross-entropy loss is used to compare the predicted probabilities with the true labels of the input images. The cross-entropy loss is a measure of the difference between the predicted probabilities and the true labels, and it is commonly used in classification tasks.

The cross-entropy loss is calculated using the following formula:


`L = -1/N * sum(y_i * log(y_hat_i))`

where:

- N is the number of input images
- y_i is the true label of the i-th input image (a one-hot encoded vector)
- y_hat_i is the predicted probability distribution for the i-th input image
- log is the natural logarithm

The overall loss for the CNN is calculated by averaging the cross-entropy loss across all input images.

During training, the goal is to minimize this loss by adjusting the weights of the CNN using an optimizer such as stochastic gradient descent (SGD) or Adam. By minimizing the loss, the CNN learns to make more accurate predictions for the input images.


## Code Example

This CNN consists of two convolutional layers with max pooling, followed by a flatten layer and a dense output layer. It is trained on the MNIST dataset, which consists of grayscale images of handwritten digits.

The Conv2D layers perform convolutional filtering on the input image to extract features, and the MaxPooling2D layers downsample the feature maps to reduce the number of parameters. The Flatten layer flattens the output of the convolutional layers into a 1D vector, which is then passed through a Dense layer with softmax activation to produce the final classification output.

The model is compiled with the adam optimizer and the categorical_crossentropy loss function, which is commonly used for multiclass classification tasks. Finally, the model is trained for 5 epochs on the MNIST dataset, and the accuracy is reported on a separate validation set.

```py
import tensorflow as tf
from tensorflow import keras
from tensorflow.keras import layers

# Define the model architecture
model = keras.Sequential([
    layers.Conv2D(32, (3, 3), activation='relu', input_shape=(28, 28, 1)),
    layers.MaxPooling2D((2, 2)),
    layers.Conv2D(64, (3, 3), activation='relu'),
    layers.MaxPooling2D((2, 2)),
    layers.Flatten(),
    layers.Dense(10, activation='softmax')
])

# Compile the model
model.compile(optimizer='adam',
              loss='categorical_crossentropy',
              metrics=['accuracy'])

# Load the MNIST dataset
(x_train, y_train), (x_test, y_test) = keras.datasets.mnist.load_data()

# Preprocess the data
x_train = x_train.reshape(-1, 28, 28, 1) / 255.0
x_test = x_test.reshape(-1, 28, 28, 1) / 255.0
y_train = keras.utils.to_categorical(y_train)
y_test = keras.utils.to_categorical(y_test)

# Train the model
model.fit(x_train, y_train, epochs=5, validation_data=(x_test, y_test))


```

## YOLO Algorithm

YOLO (You Only Look Once) is an object detection algorithm that detects objects in images and videos. It is a one-stage detection algorithm, meaning that it directly predicts bounding boxes and class probabilities for each object in a single pass through the network.

Here's a brief overview of how the YOLO algorithm works:

- Input image: The YOLO algorithm takes an input image and divides it into a grid of cells. Each cell is responsible for detecting objects that fall within it.
- Bounding box prediction: For each cell in the grid, YOLO predicts a fixed number of bounding boxes with corresponding confidence scores. Each bounding box is represented by 5 numbers: (x, y, w, h, confidence), where (x, y) is the center of the box, w is the width of the box, h is the height of the box, and confidence is the confidence score that the box contains an object.
- Class prediction: For each bounding box, YOLO predicts class probabilities for the object inside the box. The class probabilities are calculated based on the features extracted from the image using a convolutional neural network.

- Non-max suppression: YOLO uses non-max suppression to eliminate overlapping bounding boxes with lower confidence scores. This ensures that each object is detected only once.
 
- Output: The final output of YOLO is a set of bounding boxes with corresponding class probabilities for each object detected in the input image.

The YOLO algorithm is known for its speed and accuracy, and is commonly used in real-time applications such as self-driving cars and surveillance systems.



## Example 

This code loads the YOLOv3 weights and configuration files, as well as a list of class names. It then loads an image and preprocesses it for input into the network.

The image is passed through the network using the net.forward method, which returns a list of output tensors. The code then processes these tensors to extract the class IDs, confidence scores, and bounding boxes of detected objects.

The cv2.dnn.NMSBoxes function is used to apply non-max suppression to the bounding boxes and eliminate overlapping detections. Finally, the code draws bounding boxes and class labels on the input image and displays it.

Note that this is a simplified example, and the YOLOv3 algorithm can be further optimized for better performance and accuracy.

```py
import cv2
import numpy as np

# Load YOLOv3 weights and configuration
net = cv2.dnn.readNetFromDarknet('yolov3.cfg', 'yolov3.weights')

# Load class names
with open('coco.names', 'r') as f:
    classes = [line.strip() for line in f.readlines()]

# Define output layer names
layer_names = net.getLayerNames()
output_layers = [layer_names[i[0] - 1] for i in net.getUnconnectedOutLayers()]

# Load image and preprocess
img = cv2.imread('image.jpg')
height, width, channels = img.shape
blob = cv2.dnn.blobFromImage(img, 1/255, (416, 416), (0, 0, 0), True, crop=False)

# Pass image through network and detect objects
net.setInput(blob)
outs = net.forward(output_layers)

# Initialize lists for detected objects
class_ids = []
confidences = []
boxes = []

# Process network output and filter detections
for out in outs:
    for detection in out:
        scores = detection[5:]
        class_id = np.argmax(scores)
        confidence = scores[class_id]
        if confidence > 0.5:
            center_x = int(detection[0] * width)
            center_y = int(detection[1] * height)
            w = int(detection[2] * width)
            h = int(detection[3] * height)
            x = center_x - w // 2
            y = center_y - h // 2
            class_ids.append(class_id)
            confidences.append(float(confidence))
            boxes.append([x, y, w, h])

# Apply non-max suppression to eliminate overlapping boxes
indices = cv2.dnn.NMSBoxes(boxes, confidences, 0.5, 0.4)

# Draw bounding boxes and class labels on image
colors = np.random.uniform(0, 255, size=(len(classes), 3))
for i in indices:
    i = i[0]
    box = boxes[i]
    x, y, w, h = box
    color = colors[class_ids[i]]
    cv2.rectangle(img, (x, y), (x + w, y + h), color, 2)
    text = f'{classes[class_ids[i]]} {confidences[i]:.2f}'
    cv2.putText(img, text, (x, y - 5), cv2.FONT_HERSHEY_SIMPLEX, 0.5, color, 2)

# Display image with detections
cv2.imshow('YOLOv3 Object Detection', img)
cv2.waitKey(0)
cv2.destroyAllWindows()


```

















