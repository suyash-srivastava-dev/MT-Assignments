# AI-Driven Salient Soccer Events Recognition Framework for Next-Generation IoT-Enabled Environments

**Salient** : most noticeable or important

**Nx-IoT**: The rapid advancement of the Internet of Things (IoT) in real-world applications has attracted immense research endeavors in the last few years. It has got tremendous potential in industrial automation and various other fields. The use of IoT has changed the perspective of general applications in today’s world. In this article, a next-generation architecture, Nx-IoT, is proposed for conventional 6LoWPAN-based IoT. The proposed Nx-IoT architecture works in two modes: 
1) single controller-based (6SSDx) and 
2) multicontroller-based (6MSDx). 

The Nx-IoT architecture uses new algorithms for routing management and load distribution among the SDN controllers. The experimentation is carried out in a prototype testbed environment. The result shows improved performances in terms of round trip and packet drop, compared to the conventional 6LoWPAN and cloud system. The proposed Nx-IoT architecture reduces the latency and shows better throughput performances as compared to the existing state of the art.

Refer: [Nx-IoT: Improvement of Conventional IoT Framework by Incorporating SDN Infrastructure](https://ieeexplore.ieee.org/document/9924184)

## Abstract

- Important(salient) event recognition of soccer matches in Nx-IOT : Aims to analyze perfomance of players/teams by sport analytics.
- Nx-IOT devices carried by players during match, captures & transmit data.
- Interconnectivity of data acquisition devices with AI & Nx-IOT will allow spectators and managers to evaluate the player's performance.
- Nx-IoT enabled salient event detection feature to be provided as FinTech service.
- In this paper DL based framework for multiperson salient soccer event recoginition in IOT enabled Fintech.
- Proposed framework perform event regonition in three step:
    1. frames prepocessing
    2. frame level discriminative feature extraction
    3. high level event recognition in soccer video

- SVE (Soccer Video Events) dataset with 6 salient events of a game.
- Evaluated SV dataset using traditional Ml & DL algorithms.
- Also performed event recognition on untrimmed soccer video using proposed framework and compared results.

- Terms: CV,CNN,Edg Computing, Event recognition, Multilayer Long Short-term memory (MLSTM), Nx-IoT


## Introduction

The noticeable advancement in networking technolo-
gies and efficient deep learning algorithms over edge
devices has allured the sports industry to adopt next-
generation Internet of Things (Nx-IoT)-enabled financial tech-
nology (FinTech) services for a wide range of applications.

The Nx-IoT devices in
sports communicate and transmit data with other IoT/edge
devices for edge-centric distribution and processing of sports
data.

Sports organizations, especially soccer officials,
provide edge-based IoT environments, which can significantly
improve the quality of sport analytics systems and enable
the spectators to have a more enjoyable interactive expe-
rience.


The video data captured by the vision sensors can
be instantly processed over edge devices and then trans-
mitted to artificial intelligence (AI)-assisted edge computing
platforms for a variety of applications, such as event detec-
tion/recognition, player identification, and players formation
tracking in the field of a soccer stadium equipped with Nx-
IoT.


Due to the exponential growth of fans following, soccer
has become the world’s most watchable sport with more than
4.0 billion audience worldwide

According to a recent
report (Google: Watch time for YouTube sports highlights
jumps 80%), 90% of online viewers search for soccer videos
highlights or prefers to access salient sports events (such as
goal, penalties, fouls, corner-shots, etc.) rather than watching
full matches.

The Nx-IoT-enabled
edge-based event recognition service in soccer stadiums can
improve the experiences of live spectators by providing an
interactive entertainment environment.

Event recognition is an essential component for high-level
sports video analytic tasks, such as event-aware highlights
generation

Soccer events are different from
other sports events, where a video clip contains fascinating
contents for a random time interval with semantically(logical) starting and ending boundaries of events rather than a fixed time
interval. 
- For instance, in counterattack, the brilliant assist
before the goal and the celebrations after the goal are the com-
plete soccer events.
- All these events are high-level semantics,
which can be recognized with multiscale deep features (i.e.,
extract convolutional neural network (CNN) features at differ-
ent layers with varying spatial dimensionality). For instance,
in the soccer match, a goal is an event that involves differ-
ent movements of the human body, such as running, jumping,
passing ball, and shooting ball toward goalmouth.

Earlier Researches:
- for soccer event detection
and recognition were based on low-level or handcrafted visual
features and traditional machine learning algorithms. These
low-level feature-based methods rely on global features, includ-
ing the texture, edge, color, shape, and motion information.
- Although these methods made some achievements in the last
decade, they could only detect few soccer events and usually
failed for complex type of events with a clutter background.
- To decrease(minimise) semantic gap between the low-level seman-
tics and high-level semantics, several traditional soccer event
detection methods have been proposed
- These methods utilized
mid-level features to obtain the intermediate representation of
soccer events, including field view classification, player track-
ing, scoreboard detection, and play–break segmentation.
- Earlier work first extracted the excitement
clip from lengthy videos, and then detected the salient events
using histogram and color computations. In addition, these
earlier methods often required additional information such as
text from score boards and audio commentary related to the
game play. Despite, acquiring additional information about
game, the results achieved by these methods still suffered from
misclassification for complex events.

Besides the existence
of smart embedded devices and energy-friendly deep learning
architectures, it is very crucial to have a sufficient amount of
data for the problem/task under consideration. The availabil-
ity of problem-related data sets greatly helps the researchers
to train and evaluate their proposed systems without devoting
considerable efforts on generating new data sets.
- existing data sets are very specific and doesn't cover the salient events of soccer.



In this article, author has presented an efficient deep
learning-based framework for salient soccer event recognition
over edge-centric FinTech computing platform and their newly
created soccer videos events (SVE) data set.


The proposed
framework performs event recognition process in three steps:
1) preprocessing: 

    image frames are extracted from video streams and resized to match the input of the deep network.

2) features extraction

    framework uses a pretrained CNN
    architecture, which extracts deep discriminative features from
    the video frames.

3) sequence learning

    a multilayer LSTM is used to analyze the video stream by capturing the temporal relation between adjacent frames.


SVE data set contains short duration clips of six different soccer events.

The key contributions of
our scheme can be summarized as follows.
1) To recognize the salient events in soccer matches, we
investigated traditional machine learning (HOG+SVM)
and deep learning-based approaches (CNN+MLSTM)
for FinTech-enabled soccer event recognition service and
propose an energy-efficient CNN+LSTM framework.
Our proposed framework strikes a tradeoff between
computational complexity and model accuracy and is
a suitable solution for edge-centric FinTech computing
platforms and similar domains associated with Nx-IoT
environments, showing its flexibility and scalability

2) The literature contains very few data sets for soccer
event detection/recognition. However, there is no bench-
mark data set of key events, which defines the interest
of live/offline spectators. We have created our own SVE
data set, which contains salient events of soccer matches
captured from multiple views. The SVE data set is pub-
licly available for further research to mature the event
detection/recognition systems for soccer videos.

3) We have conducted comprehensive experiments on our
newly created SVE data set to evaluate the performance of
our framework. Furthermore, we have tested the proposed
framework on relevant events from other data sets and
have conducted a comparative study. The obtained results
reveal that the proposed framework generalizes well and
performs better than existing methods.























