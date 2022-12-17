# Apache Spark + GraphFramse + GraphX

<img width="500" src="https://user-images.githubusercontent.com/109574120/208010754-7c6b682e-be43-4c40-969e-bf4c1ebb8cb1.png">

The Spark GraphFrame is a powerful abstraction for processing large graphs using distributed computing. It provides a plethora of common graph algorithms including label propagation and PageRank. Further, it provides the foundations for implementing complex graph algorithms, including a robust implementation of the Pregel paradigm for graph processing.

# INTRODUCTION

GraphFrame mainly provides the following built-in algorithms:

    Triangle count

    PageRank

    Shortest Path
    
<img width="500" src="https://user-images.githubusercontent.com/109574120/208010917-d9214f60-7f31-4374-bd69-1456ce3baa68.png">

# IMPLEMENTATION

**Step 1:1. Create GCP project and compute engine vm instance**

<img width="500" src="https://user-images.githubusercontent.com/109574120/208011072-f0568a99-3460-4ac2-b66f-8ba750ce9e5c.png">


**Step 1:2. Install pyspark and java 11**

**Step 1:3. Verify the pyspark**

     $ pyspark
     

<img width="700" src="https://user-images.githubusercontent.com/109574120/208011421-55969cd5-7140-47cb-bc73-6987c01ff9dc.png">

**Step 1:4. Prepare data files**

      $ vi person.csv

      $ vi relation.csv

<img width="500" src="https://user-images.githubusercontent.com/109574120/208011540-11139c67-d19e-4b86-9f9c-f961b9010cca.png">

  
**Step 1:5.Prepare script file- pyspark-graphX.py**
  
    $ vi pyspark-graphX.py
  
  
**Step 1:6.Submit the job**

   $ spark-submit --packages graphframes:graphframes:0.8.2-spark3.1-s_2.12 pyspark_graphX.py
  
  
# Result

<img width="800" src="https://user-images.githubusercontent.com/109574120/208011883-dfd761b1-7ab6-444c-9ac0-9132d0ee4670.png">


# DETAILED DOCUMENTATION

[GraphFrame.pdf](https://docs.google.com/presentation/d/1wGdTpf6uo4YUb2mSgkQLmgje2Npil6NSoPlzZl-UxwI/edit#slide=id.g1bae8592526_0_152)

  

