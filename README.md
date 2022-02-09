# Verve Coding Challenge for Data Engineers



### 1: RUNNING THE CODE.

* This version of the challenge was done using PyCharm IDE Notebook in SparK.

* To run this code, simply download the .ipynb file and open in Jupyter Notebook, Google Colab or in PyCharm IDE using notebook interface.

* The JSON datasets were pulled directly from the URL repository. And runnig the code is as easy as pressing `Shift key` + `Return key`.

* To run the scala file, simply call the `scala compiler` on the file in CLI having scala installed or better still, an IDE with 'scalac' support. 



### 2: TECHNICALITIES.

* Even though the technical requirement specifies that Questions 1 and 2 be completed with Scala programming and Question 3 can be done using, I ensured
  that I completed the tasks with Python, Spark and Scala. 
  
* This was done to see the ease of using these technologies to completing the coding challenge tasks. And I must point out that it is just out of my own 
  curiosity and exploration.
  
  
  
### 3: SUMMARIES OF MY FINDINGS ON THE DATASETS.

* `clicks.json` is a clean JSON file with no empty or null fields. This is a very important dataset to determining the revenues generated per each advertised
impression.

* Loading and parsing the clicks.json file was smooth and no hiccups was encoutered.

* `impressions.json` file on the other hand has many missong values in the `country_code` field which possibly is one of the major field in computing the needed
  metrics and performance of the datasets.
  
  

### 4: TAKE AWAY AND FUTURE OPTIMIZATION.

* According to the datasets, there are 4 major countries targeted by the advertisers, namely:
  
  * United State
  * United Kingdom
  * Italy, and
  * Denmark

* There may be more, but at this time, we do not know for sure as some `country_code` fields has been lost in transmission.

* Major revenue where made out of United State and this is grossly can be inferred from the population of App Users staying in the US and which points out US as 
  the major marketing hub for advertisement, followed by UK while others follow, respectively.

* The empty fields in the `country_code` field could drastically affect the metrics and performance computation as the data lost is somewhat irreversible 
  at this point.
  
* As future optimization to this project, the need to find a workaround to updating the empty `country_code` field will be a major turning back, not only for
  the tageted markets, but for the `Business insight` of the company as a whole which could help diversify the company resources to the best location for optimum
  return on investment (`ROI`).
  
  

### 5: CLOSING REMARK.

Thank you for reading thus far. I hopefully-hope to hear from you soon. 

  
