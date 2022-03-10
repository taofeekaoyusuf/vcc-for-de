# Verve Coding Challenge for Data Engineers



### 1: RUNNING THE CODE.

* Question 1 and part of Q2 was explored using `Maven with Scala backend` and later changed to `Scala with SBT backend` due to conflicts with `Maven-Scala`  
  repository and also, Questions 1 - 3, of the challenge was fully completed using `SparK` in PyCharm IDE Notebook.
  
* To run this code, simply download the .ipynb file and open in Jupyter Notebook, Google Colab or in PyCharm IDE using notebook interface.

* The JSON datasets were pulled directly from the URL repository. And runnig the code is as easy as pressing `Shift key` + `Return key`.

* To run the scala file, simply call the `scala compiler` on the file in CLI having scala installed or better still, an IDE with 'scalac' support. 



### 2: TECHNICALITIES.

* Even though the technical requirement specifies that Questions 1 and 2 be completed with Scala programming and Question 3 be done using other technologies, I 
  ensured that I completed the tasks with Scala, Spark and Python. 
  
* This was done to see the ease of use with these technologies in completing the coding challenge tasks. And I must point out that it is just out of my 
  curiosity and exploration insight.
  
  
### 3: SUMMARIES OF MY FINDINGS ON THE DATASETS.

* `clicks.json` is a clean JSON file with no missing values, such as, `empty or null` fields. This is a very important dataset in order to determine the revenues generated per each advertised impression.

* Loading and parsing the clicks.json file was smooth and no hiccups was encoutered.

* `impressions.json` file on the other hand has many missing values in the `country_code` field, and which possibly is one of the major field in carrying out the
  needed computation for the metrics and performance of the datasets.
  
  

### 4: TAKE AWAY AND FUTURE CODE OPTIMIZATION.

* According to the datasets, there are 4 major targeted countries by the advertisers, namely:
  
  * United State
  * United Kingdom
  * Italy, and
  * Denmark
  * worth mentioning their could be others due to missing values in the `country_code` field.

* There may be more, but at this time, we do not know for sure, as some `country_code` fields has been lost in transmission, I believe.

* It was observed that major `revenue were made out of the United State`, and this can grossly be inferred from the number of `App Users` staying in the US and 
  which points out US as the major marketing hub for advertisement, followed by UK while others countries follow, respectively.

* The empty fields in the `country_code` field could drastically affect the metrics and performance computation, as the missing data is obviously and somewhat 
  irreversible at this point.
  
* For future code optimization to this project, the need to find a workaround to updating the missing  fileds of the `country_code` field will be a major turning 
  point, not only for the tageted markets, but for the `Business insight` of the company as a whole which could help divert the company resources to the best 
  location for optimum return on investment (`ROI`) and reduced OPEX.
  
  

### 5: CLOSING REMARK.

Thank you for reading thus far. I hopefully-hope to hear from you soon. 

  
