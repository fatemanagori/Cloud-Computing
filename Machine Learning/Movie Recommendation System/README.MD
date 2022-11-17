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

[PySpark Code(.ipynb)](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/fnn.py)

[movies.csv](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/movies.csv)

[ratings.csv](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/ratings.csv)

[tags.csv](https://github.com/fatemanagori/Cloud-Computing/blob/main/Machine%20Learning/Movie%20Recommendation%20System/tags.csv)

**Step 2: Study [Colab](https://hc.labnet.sfbu.edu/~henry/npu/classes/machine_learning/colab/slide/get_start.html)**

Colab, or "Colaboratory", allows you to write and execute Python in your browser, with

Zero configuration required

Access to GPUs free of charge

Easy sharing

Whether you're a student, a data scientist or an AI researcher, Colab can make your work easier.

**Step 3: Experiment Pyspark code (ipynb) of PySpark Collaborative Filtering with ALS**
**Step 3.1: Download the Pyspark code (ipynb)**
**Step 3.2: Upload the ipynb file to your Colab**
1.First upload the data to the running space, then install pyspark in Google Colab

2.Result

3.Save the modified ipynb file as py format

4.Save the modified ipynb file as HTML format which can be used on Step 5 of this project

**Step 3.3: Experiment Pyspark code (ipynb) by modifying the ipynb file**
**Step 3.4: Save the modified ipynb file as py format**
**Step 3.5: Run the py file saved at Step 3.4 on GCP**
