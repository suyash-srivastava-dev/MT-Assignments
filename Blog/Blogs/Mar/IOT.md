# Proposed Methodology

Newly upgraded prototypes have been designed to overcome the existing limitations. The three-tier architecture of the proposed prototype for monitoring miners’ health.

#
## Sensing Unit

This tier act as a base for monitoring and alerting system. The
objective of this tier is to sense the individual health parameters
(body temperature and heartbeat) and individual nearby environment
parameters (environment temperature, air quality, silica dust particle,
fire, and humidity). All these parameters are measured using ambient
light weight sensors mounted on the helmet.

### **1. Heartbeat sensor**

collect the heart rate information of the
user. Workers may undergo some panic situations during mining due
to various environmental changes. Hence, a change in heart rate alert
will help the rescue team take early actions to avoid accidents.

![HeartRate](./heartRate.png)

### **2. Gas Sensor (MQ135)**

![SensorImage](https://i2.wp.com/microcontrollerslab.com/wp-content/uploads/2017/04/1-sensor.jpg?ssl=1)

here are various gaseous pipelines
leakage or may be due to some chemical effects, hazardous gases
like carbon monoxide, Ammonia, and many others may get generated.
Hence, it will make it difficult for anyone to work under such condi-
tions. This sensor will provide information that present conditions are
suitable for working or not. Even after crossing a threshold limit related
to these harmful gases, it will generate an alarm to save the life of workers.

![Gas](./gas.png)

### **Working**

The gas sensor module consists of a steel exoskeleton under which a sensing element is housed.
This sensing element is subjected to current through connecting leads. This current is known as
heating current through it, the gases coming close to the sensing element get ionized and are
absorbed by the sensing element. This changes the resistance of the sensing element which
alters the value of the current going out of it.
Used in air quality control equipment for buildings/offices, is suitable for detecting
of NH3, NOx, alcohol, Benzene, smoke, CO2, etc.


The following are the mathematical formulae used by the IoT
sensors to compute the individual’s nearby environmental parameters.

![ChangeInValueOfResistance](./changeResistanceWithGas.png)

Ro is the sensor resistance at 100ppm of NH3 in clean air, and Rs is the sensor resistance at various concentrations of gases.

 Rs is the resistance of the sensor that changes depending on the concentration of gas, whereas Ro is the resistance of the sensor at a known concentration without the presence of other gases, or in the fresh air.
The fact that the Rs/Ro ratio is a constant in clean air.
 The scale is log-log i.e. in a linear scale, the behavior of the gas concentration with respect to the resistance ratio is exponential (not linear)

Using the library-supported [Arduino setup](https://github.com/GeorgK/MQ135), MQ-135 gas sensor calibration is done at first by finding the value of Ro in fresh air, and then using that value to find Rs through the formula:

Rs = (Vcc/VRL-1)x RL

Rs = (5V/(sensorValue * (5.0/1023.0))-1)*RL

Value of the load resistor (RL) about 20KΩ (10KΩ to 47KΩ).

![Formula](./gasFormula.png)

        𝑛 = Q/volume,
        𝑉𝐶𝑜𝑛𝑠𝑡 is Constant Value = 5,
        𝐴𝑖𝑟𝐶𝑜𝑛𝑐 is CO2 Concentration air,
        𝐺𝑎𝑠𝑒𝑚𝑖𝑠𝑠𝑖𝑜𝑛 is CO2 Emission (1/min),
        𝑎𝑖𝑟𝑒𝑥𝑐ℎ𝑎𝑛𝑔𝑒 is Air exchange per hour,
        𝑒 is Constant value 2.1718,
        𝑡 is time in minutes,
        𝐶𝑖𝑛𝑑𝑜𝑜𝑟 is CO2 concentration indoor,
        𝐶𝑜𝑢𝑡𝑑𝑜𝑜𝑟 is CO2 concentration outdoor

### **3. Optical dust sensor (GP2Y1010AU0F)**

This sensor is composed of a phototransistor and infrared emitting
diode. It identifies the light reflected by the dust particle. This sensor
is capable enough to identify fine dust particles like smoke, cigarette
hash, house dust, etc.
describes the standard measures of air
dust. As shown in the tables below, the definitions of various
symbols are computed 

![AirParticle](./airParticle.png)
![AirFormula](./AirFormula.png)

𝐴𝑣𝑒𝑟𝑎𝑔𝑒𝑏𝑒𝑡𝑡𝑖𝑐𝑘𝑠 is the number of dust elements between two
subsequent ticks,

𝑁𝑢𝑚𝑏𝑒𝑟𝑡𝑖𝑐𝑘𝑠 is total ticks 

𝑉 𝑜𝑙𝑢𝑚𝑒𝑝𝑢𝑚𝑝𝑒𝑑𝑎𝑖𝑟 is air
volume.

### **4. Temperature and humidity sensor (DHT11)**
It is a digital, low-cost humidity, and temperature sensor. It utilizes
a thermistor and capacitive sensor for quantifying the humidity, and
temperature of surrounding environment in the form of digital signals.

![DHTTable](./DHTValues.png)

![DHTFormulas](./DHTFormula.png)

𝑇 𝑒𝑚𝑝𝑀𝑒𝑎𝑠𝑢𝑟𝑒 is Temperature, 𝑃 𝑟𝑒𝑠𝑠𝑢𝑟𝑒𝑆𝑎𝑡𝑢𝑟 is Saturation pressure,

𝑇 𝑒𝑚𝑝𝐶𝑟𝑖𝑡𝑖𝑐𝑎𝑙 is Critical temperature 647.096 (K),

𝑃 𝑟𝑒𝑠𝑠𝑢𝑟𝑒𝐶𝑟𝑖𝑡𝑖𝑐𝑎𝑙 Critical
Pressure 220640 (hpa), 

𝐶𝑜𝑛𝑠𝑡1 is −7.85951783,

𝐶𝑜𝑛𝑠𝑡2 is 1.84408259,

𝐶𝑜𝑛𝑠𝑡3 is −11.7866497,

𝐶𝑜𝑛𝑠𝑡4 is 22.6807411,

𝐶𝑜𝑛𝑠𝑡5 is −15.9618719,

𝐶𝑜𝑛𝑠𝑡6 is 1.80122502,

𝑇𝑒𝑚𝑝𝑛 is Temperature (triple point) 273.16 K,
(triple point of a substance is the temperature and pressure at which the three phases (gas, liquid, and solid) of that substance coexist in thermodynamic equilibrium.)

𝑃𝑟𝑒𝑠𝑠𝑢𝑟𝑒𝑛 is Pressure vapor at 𝑇 𝑒𝑚𝑝𝑛 ,

𝑃𝑟𝑒𝑠𝑠𝑢𝑟𝑒𝑆𝑎𝑡𝑢𝑟 is Pressure vapor
saturation,

𝑛0 is-13.928169, 𝑛1 34.707823,

𝑇𝐻𝑢𝑚𝑖𝑑𝑖𝑡𝑦 is Humidity and

𝐴𝑏𝑠𝑜𝑙𝑢𝑡𝑒𝐻𝑢𝑚𝑖𝑑𝑖𝑡𝑦 is Absolute humidity.


### **5. Flame sensor (YG1006)**


Flame Sensor — 5 mm IR Diode can work as a fire detection flame
sensor module, fire source detection modules. This Flame Sensor can
be used to detect fire sources or other light sources of the wavelength
in the range of 760 nm–1100 nm. It is based on the YG1006 sensor
which is a high speed and highly sensitive NPN silicon phototransistor.
Due to its black epoxy, the sensor is sensitive to infrared radiation. It
can be used as a flame Sensor for Smart Car. It gives analog results like
i.e., 0 for no fire and 1 for fire or a light source of wavelength in range
760 nm–1100 nm is detected.

![FlameSensor](./FlameSensorTable.png)

### **6. Respiratory filter (P95) and other**

P95 respirator filters filter 99.97 percent of all particles at least
0.3 μm in diameter and oil proof, which prevents the inhaling of coal
dust and silica dust. These sensors are embedded on helmet along with an RFID tag and reader is utilized to trace the live
location and an LCD screen to show the real-time values detected by
these sensors.
The power supply to the complete systems is given by the battery
installed as overall power consumption is not so high to operate these
sensors. These IoT devices are lightweight and mounted on the surface
of the helmet in such a way that it will not give a heavier object feeling
on the head.

#
## Computing Unit
This tier comprises IoT gateways. The responsibility of this tier is to
communicate both sensing and monitoring tier, i.e., gather data from
the sensing layer, after processing, transfer the data to the monitoring
layer.

### **System architecture**
System architecture comprises three units, Transmitting, Receiving, and Central Unit. 

* The Transmitting unit consists of temperature,
humidity, heartbeat, gas, flame, and optical dust sensors. 
All these
sensors are connected to Arduino Uno, power supply, RFID reader,
and nRF1 transmitter module.

* The Receiving Unit consists of an nRF2
receiver that receives the sensor’s value, GSM/GPRS.

* The Central Unit
consists of nRF3 and ESP8266 Wifi modules to save a miner worker’s
health report for future reference on the cloud. This tier comprises
IoT gateways. The responsibility of this tier is to communicate both
sensing and monitoring tier, i.e., gather data from the sensing layer,
after processing, transfer the data to the monitoring layer.

 
![Architecture](./architecture.png)

### **1. RFID Tag and Reader**

RFID technology involves two components, i.e., RFID tags and
RFID readers. RFID tags are made up of an antenna and the
integrated circuits (IC) responsible for sending data to the RFID
reader. RFID tags are made up of plastics with unique tags
(identification number or name) embedded within the layers.
The RFID readers convert radio signals to helpful information;
this information is transferred to the communicating host system
to locate the real-time position on the miner.


### Reference
The LM7805 is a voltage regulator that outputs +5 volts

#
## Monitoring Unit

#

# References

1. [Codrey Blog for Gas Sensor](https://www.codrey.com/electronic-circuits/how-to-use-mq-135-gas-sensor/)

2. [Wikipedia Triple point](https://en.wikipedia.org/wiki/Triple_point)

3. 