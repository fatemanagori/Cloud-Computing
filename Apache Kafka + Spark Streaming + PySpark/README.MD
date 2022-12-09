# Kafka
<img width="500" src="https://user-images.githubusercontent.com/109574120/206594728-f5afe766-c91f-45a0-9bf0-2e5edefe25d1.png">

Real-time data ingesting is a common problem in real-time analytics, because in a platform such as e-commerce, active users in a given time and the number of events created by each active user are many. Hence, recommendations (i.e., predictions) for each event or groups of events are expected to be near real-time.
The primary concerns are, How we will [consume, produce, and process] these events efficiently?
Apache Kafka addresses the first two problems stated above. It is a distributed streaming platform, which helps to build real-time streaming data pipelines.

# PROCEDURE

**Kafka + Spark Streaming + PySpark**

**Step 1: Study the basic concepts about Kafka**

[QuickStart — Apache Kafka + Kafka-Python](https://towardsdatascience.com/quickstart-apache-kafka-kafka-python-e8356bec94)

1.The latest version of Kafka binary distribution is available at https://kafka.apache.org/downloads

2.Starting Zookeeper. Unzip it, get into the folders   AND   cd into it
 
3.Starting Kafka Brokers Create another terminal, do not close zookeeper 
 
4.Creating Kafka Topics. Create another terminal, do not close zookeeper and kafka brokers

 bin/kafka-topics.sh --create --topic input_recommend_product --zookeeper localhost:2181 -- partitions 3 --replication-factor 1

<img width="500" src="https://user-images.githubusercontent.com/109574120/206596124-cb5f0c1d-5ca4-4dc5-b080-7a260e04d341.png">

bin/kafka-topics.sh --create --topic input_recommend_product --bootstrap-server localhost:9092 --partitions 3 --replication-factor 1

<img width="500" src="https://user-images.githubusercontent.com/109574120/206596546-0a2506d0-10f2-4c83-b21d-151db331c284.png">

5.Creating Producer and Consumer using Kafka-python :  Create producer.py:
<img width="500" src="https://user-images.githubusercontent.com/109574120/206596982-be84eb40-0b9b-4e89-b2c3-677d914acc37.png">

 pip3 install msgpack
 
 pip3 install kafka-python 
 
 6.Create consumer.py: 
 
 <img width="500" src="https://user-images.githubusercontent.com/109574120/206596851-58fb8bde-03e4-44a0-8cd9-9b8c3db3b384.png">
      
 7.Run comsumer.py first (you can run it in your IDE) 
 
 8.Create another terminal, run the producer.py
 
 9.Go to the consumer terminal, you can see the result
 
 <img width="500" src="https://user-images.githubusercontent.com/109574120/206597505-81d17958-7c74-4f1e-bda7-8f9b1f7955e6.png">
 
 **Step 2: Study the basic concepts about Spark Streaming**
 
 [Spark Streaming basic concepts at GCP](https://hc.labnet.sfbu.edu/~henry/npu/classes/learning_spark/spark_streaming/slide/exercise_spark_streaming.html#word_count)

 <img width="500" src="https://user-images.githubusercontent.com/109574120/206598300-2d00dc8b-dee4-4f8b-bdae-20c7992cb383.png">
 2.1 Installing Spark which is availabe at https://spark.apache.org/downloads.html
 
    download the package and unpack it
    
    $ wget https://dlcdn.apache.org/spark/spark-3.3.1/spark-3.3.1-bin-hadoop3.tgz
    
    $ tar -xvf spark-3.3.1-bin-hadoop3.tgz
    
  2.2 Create a soft link
  
    $ ln -s /home/fnagori/spark-3.3.1-bin-hadoop3 /home/fnagori/spark
    
      set spark related environment varibales
      
   2.3 Export SPARK_HOME=/home/fnagori/spark
      
      export PATH=$SPARK_HOME/bin:$PATH
      
      export PATH=$SPARK_HOME/sbin:$PATH
      
   2.4 Install JAVA

    $ sudo apt update
    
    $ sudo apt-get install openjdk-8-jdk
    
    $ update-alternatives --list java
    
    $ export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/jre
    
   2.5 Launch pyspark
   
   <img width="500" src="https://user-images.githubusercontent.com/109574120/206599110-e62451a0-6da0-4358-ba5a-86041ac271df.png">
   
       $ start-master.sh

   2.6 In your browser, paste and go the link http://34.172.96.149:8080
   
       $ start-slave.sh spark://34.172.96.149:7077
       
   2.7 In the browser (http:///34.172.96.149:8080 ), you can see one alive worker as bellow
   
   <img width="500" src="https://user-images.githubusercontent.com/109574120/206599445-7e18069f-8721-426f-bff7-b2e8511bbcb9.png">
   
   2.8 Run Spark Streaming Word Count example
   
      Open a terminal 1:
      
       $ nc -lk 9999
       
    <img width="500" src="https://user-images.githubusercontent.com/109574120/206599626-2c16d1bb-14a4-4931-822b-dbbff09d819d.png">
    
     Open another terminal 2:
     
       $ ./bin/spark-submit examples/src/main/python/streaming/network_wordcount.py localhost 9999
       
   **Run Networking WordCount example in python sucessfully:**
   
    <img width="500" src="https://user-images.githubusercontent.com/109574120/206599934-56ccc279-888b-4add-a1e5-5cb98b1dfcc7.png">
   
   
**3. ShutDown Project at GCP**

<img width="500" src="https://user-images.githubusercontent.com/109574120/206600602-7d509427-5a65-4ee1-8f3f-26ba01730798.png">

# Detailed Presentation Below

[Kafka + Spark Streaming + PySpark](https://docs.google.com/presentation/d/1Ls4alNBYcuGc4D48xFgEFXiM6vn3zY2Pgcpz2qLZ_IY/edit#slide=id.g1adf96596ca_0_283)
   




