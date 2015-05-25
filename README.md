# berkeley-entity-server
Simple Java REST API wrapper for the Berkeley Entity Resolution System

## This is simply a placeholder for the moment
The plan is to make it  operate in a similar fashion to https://github.com/mdda/corenlp-java-server


### Downloading the Entity Data 

From :  http://nlp.cs.berkeley.edu/projects/entity.shtml 
(which appears to be a very temperamental / *spurty* server):

```
curl -O http://nlp.cs.berkeley.edu/downloads/berkeley-entity-models.tgz
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  886M  100  886M    0     0   564k      0  0:26:46  0:26:46 --:--:-- 5044k

# Upon completion :
ls -l berkeley-entity-models.tgz 
-rw-rw-r--. 1 andrewsm andrewsm 929073602 May 21 02:01 berkeley-entity-models.tgz
```


### Downloading the Berkeley Entity Resolution System source

```
git clone https://github.com/gregdurrett/berkeley-entity.git
# This downloads 20.63Mb of git objects
```

Unless you need to alter the source code itself, all that this project 
requires is the pre-compiled jar file:

```
ls -l berkeley-entity/*.jar
-rw-rw-r--. 1 andrewsm andrewsm 15287983 May 25 13:19 berkeley-entity/berkeley-entity-1.0.jar

```

