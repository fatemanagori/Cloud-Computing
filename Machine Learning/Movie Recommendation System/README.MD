# COLLABORATIVE FILTERING
<img width="304" alt="Map Reduce" src="https://miro.medium.com/max/1400/1*3ALliiz9hG79_2xopzgyrQ.png">

Collaborative filtering is a system that predicts user behavior based on historical user data. From this, we can understand that this is used as a recommendation system. For example, Amazon recommends products or gives discounts based on historical user data or YouTube recommends videos based on your history.

# Why do we need this though?
We want to encourage user engagement, by trying to predict what the user may enjoy or require so that we can get the user hooked to our service. We have designed unique algorithms for services like Netflix, Spotify, and Amazon so that we can give recommendations based on the user’s preference and remove redundant and irrelevant information.

There are three types of recommendation systems :

**1.Content-based filtering**: We use the user’s historical activity data(like what movies he likes, what movies he doesn’t like) to make predictions about similar products that the user is going to like.

**2.Collaborative filtering:** In this technique, we use the historical data of other preferences of other users (hence the word collaborative) to make predictions about what a particular user may like. Say, many users who have watched the movie Iron Man, have also watched Avengers. Hence, our system will recommend Avengers to the user who has only watched Iron Man.

**3.Hybrid model:** As the name suggests, this system is a combination of the above two models.
<img width="476" alt="new8" src="https://user-images.githubusercontent.com/109574120/202352175-ea1a9451-181a-4e53-95ed-53cdf9d3a47f.png">

# PROCEDURE

**Movie Recommendation with MLlib - Collaborative Filtering**

**Step 1: Study [PySpark Collaborative Filtering with ALS**](https://medium.com/@jonahflateman/building-a-recommender-system-in-pyspark-using-als-18e1dd9e38e6)

[1. PySpark Code(.ipynb)](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/fnn.py)

2. [movies.csv](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/movies.csv)

[3. ratings.csv](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/ratings.csv)

[4. tags.csv](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/tags.csv)

**Step 2: Study [Colab](https://hc.labnet.sfbu.edu/~henry/npu/classes/machine_learning/colab/slide/get_start.html)**

Colab, or "Colaboratory", allows you to write and execute Python in your browser, with

##Zero configuration required

##Access to GPUs free of charge

##Easy sharing

##Whether you're a student, a data scientist or an AI researcher, Colab can make your work easier.

**Step 3: Experiment Pyspark code (ipynb) of PySpark Collaborative Filtering with ALS**

**Step 3.1: Download the Pyspark code (ipynb)**

**Step 3.2: Upload the ipynb file to your Colab**

<img width="487" alt="new16" src="https://user-images.githubusercontent.com/109574120/202360126-8c70ad0f-45e4-4fde-b5b8-7dd5de188c6f.png">


**Step 3.3: Experiment Pyspark code (ipynb) by modifying the ipynb file**

**Result**

<img width="706" alt="new17" src="https://user-images.githubusercontent.com/109574120/202360153-9f14a133-7521-476a-9756-0932a76249e7.png">

**Step 3.4: Save the modified ipynb file as py format**

<img width="488" alt="new18" src="https://user-images.githubusercontent.com/109574120/202360194-4b9051c5-8be8-4140-9861-d546d4bf3f84.png">

**Step 3.5: Save the modified ipynb file as HTML format**

<img width="508" alt="new19" src="https://user-images.githubusercontent.com/109574120/202360249-bf99a43a-eb79-4830-8b55-8d701cdaf151.png">



**Step 3.6: Run the py file saved at Step 3.4 on GCP**

# 1.Set up PySpark Enviroment on GCP

Steps:

**1. Enable the Google Cloud Compute Engine API**

**2. Create, Configure and Launch a Google Cloud Dataproc cluster**

<img width="960" alt="new1 (2)" src="https://user-images.githubusercontent.com/109574120/202370459-1602d624-c99f-4e0b-92d4-0510e1bfb4ab.png">


**3. Connecting to the Master Node using Secure Shell (ssh)**

<img width="540" alt="new20" src="https://user-images.githubusercontent.com/109574120/202368747-0c84ec66-a0e4-4aaa-8bf4-43afbfe923c3.png">

**4. Run the .py file and check result at GCP**

**Steps to run PySpark Program at GCP**

1.Prepare Data:upload movies.csv and ratings.csv files at GCP

2.Create a directory (folder) to store the data: hdfs dfs -mkdir hdfs:///mydata

3.Copy the date to HDFS:

 hdfs dfs -put movies.csv  hdfs:///mydata
 
 hdfs dfs -put ratings.csv  hdfs:///mydata
 
4.Prepare the program: vi fnn..py

5.Modify the path of movies.csv and ratings.csv in program

movies=hdfs:///mydata/movies.csv

ratings=hdfs:///mydata/ratings.csv

6.Running the program with Pyspark: spark-submit fnn.py 


<img width="687" alt="new11 (2)" src="https://user-images.githubusercontent.com/109574120/202369805-626d4808-c3ea-4004-a67f-bcabb5e92719.png">

<img width="685" alt="new13 (2)" src="https://user-images.githubusercontent.com/109574120/202369830-cb16a27c-b37b-4823-9968-71fa4fc6c2b8.png">

**5. ShutDown Cluster**

<img width="960" alt="pgrnk8 (2)" src="https://user-images.githubusercontent.com/109574120/202370791-af9debbb-8c49-404e-9e41-e468aa49de8e.png">

# Detailed Presentation Below

[Movie Recommendation with MLlib - Collaborative Filtering](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/Movie%20Recommendation%20with%20MLlib%20-%20Collaborative%20Filtering.pdf)
