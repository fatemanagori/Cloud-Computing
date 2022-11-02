# PAGERANK 
<img width="304" alt="Page Rank" src="https://user-images.githubusercontent.com/109574120/199366787-a5527c9f-03da-4eed-8135-c36796e2b742.jpg">

If<br />
The initial PageRank value for each webpage is 1.<br />
PR(A) = 1<br />
PR(B) = 1<br />
PR(C) = 1<br />
Page B has a link to pages C and A<br />
Page C has a link to page A<br />
Page D has links to all three pages<br />

1. A's PageRank is<br />
PR(A) = (1-d) + d * (PR(B) / 2 + PR(C) / 1 + PR(D) / 3)<br />
2. B's PageRank is<br />
PR(B) = (1-d) + d * (PR(D) / 3)<br />
3. C's PageRank is<br />
PR(C) = (1-d) + d * (PR(B) / 2 + PR(D) / 3)<br />
4. D's PageRank is<br />
PR(D) = 1-d<br />
Damping factor is 0.85<br />


Then after 1st iteration<br />
Output<br />
Page B would transfer half of its existing value, or 0.5, to page A and the other half, or 0.5, to page C.<br />
Page C would transfer all of its existing value, 1, to the only page it links to, A.<br />
Since D had three outbound links, it would transfer one third of its existing value, or approximately 0.33, to A.<br />

Input<br />
1. PR(A)<br />
= (1-d) + d * (PR(B) / 2 + PR(C) / 1 + PR(D) / 3)<br />
= (1-0.85) + 0.85 * (0.5 + 1 + 0.33)<br />
= 1.71<br />
2. PR(B)<br />
= (1-d) + d * (PR(D) / 3)<br />
= (1-0.85) + 0.85 * 0.33<br /><br />
= 0.43<br />
3. PR(C)<br />
= (1-d) + d * (PR(B) / 2 + PR(D) / 3)<br />
= (1-0.85) + 0.85 * (0.5 + 0.33)<br />
= 0.86<br />
4. PR(D)<br />
= 1-d<br />
= 0.15<br />

continue iteration.....

# OBSERVATION
A web page does not have input will have<br />
constant PageRank: 1-d<br />
the smallest PageRank<br />
Input Web Pages' impact to the PageRank of a web page<br />
The more Input Web Pages the better.<br />
The higher PageRank of an Input Web Page the better.<br />

# QUESTION
<img width="900" alt="Page Rank" src="https://user-images.githubusercontent.com/109574120/199407400-6e4b3019-fa8a-46a1-8911-d44aee6a3a2c.jpg">

# Pagerank_PySpark_GCP

SET UP ENVIROMENT of PYSPARK at GCP<br />
● Enable the Google Cloud Compute Engine API<br />
● Create, Configure and Launch a Google Cloud Dataproc cluster<br />
● Connecting to the Master Node using Secure Shell (ssh)<br />

● Prepare Data:vi pagerank_data.txt
● Create a directory (folder) to store the data: <br />
hdfs dfs -mkdir hdfs:///mydata<br />
● Copy the date to HDFS:<br /> 
hdfs dfs -put pagerank_data.txt hdfs:///mydata<br />
● Prepare the program: vi pagerank.py<br />
● Running the program with Pyspark: spark-submit<br /> 
pagerank.py hdfs:///mydata/pagerank_input.txt 1<br />

<img width="900" alt="Page Rank" src="https://user-images.githubusercontent.com/109574120/199411565-2872de4d-3466-4a00-8a85-d0dcb7201df6.jpg">

# Pagerank_Scala_GCP

SETUP Scala Environment at GCP

Create a Cloud Storage bucket<br />
Create a Dataproc cluster<br />
Connecting to the Master Node using Secure Shell (ssh)<br />
install scala

$ export SCALA_HOME=/usr/local/share/scala<br /> 
$ export PATH=$PATH:$SCALA_HOME/ <br />
1.Prepare data: vi pagerank_data.txt<br />
2.create a directory (folder) to store the data:<br />
hdfs dfs -mkdir hdfs:///mydata<br /> 
hdfs dfs -put pagerank_data.txt hdfs:///mydata<br />
hdfs dfs -ls hdfs:///mydata<br />
$ spark-shell<br />

# Test Result
<img width="900" alt="Page Rank" src="https://user-images.githubusercontent.com/109574120/199412508-64cd516a-8ab9-4eda-8fd2-3c9ffdf48b51.jpg">

# NOTE
Make sure to shut down cluster after project completion 

# DETAILED EXPLAINATION
[PAGERANK AT GCP](https://docs.google.com/presentation/d/18RguwpSdbAsdFj_vMmsAx83WRk6wdVHeHvCqeLRBHTM/edit#slide=id.p)

# CREDIT
Special Thanks to **Prof Henry Chang** for providing guidence throughout this project.

