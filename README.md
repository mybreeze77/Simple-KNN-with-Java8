#Simple KNN Algorithm with Java 8
This is a simple experimental KNN (Actually K=1) algorithm implemented with Java 8 features. The purpose is to provide a different through of implementation and design.

##Build & Run
The project is built by Gradle. Go to the root directory and execute below command.

    gradle build

If you want to import project to Eclipse, please execute below command.

	gradle eclipse

Also, to install Gradle plugin in Eclipse will be more convenience.

The main test method is located at *src/test/java/com/sample/Test.java*

##Algorithm
By using Java 8 stream and lambda, the core algorithm becomes very brief and clear (actually only TWO lines).

We can leverage different distance algorithms for KNN. Here we've provided *Euclidean* and *Manhattan* ones, as functional style.

	public static BiFunction<double[], double[], Double> euclideanDistanceFunc = DistanceUtil::euclidean;
	public static BiFunction<double[], double[], Double> manhattanDistanceFunc = DistanceUtil::manhattan;


##Data Set
We use the best known dataset in the pattern recognition literature - ***Iris***, as our testing data. Since label  is set as *int* type, we preprocess ***Iris*** and alter the label to *int* (0, 1, 2). Below is one example.

	4.9,3.1,1.5,0.2,"Iris-setosa"
Covert to 

	4.9,3.1,1.5,0.2,0

Note: The *Iris.csv* file in the project is the one which has been converted.

##Verification
According to tradition, we shuffle and divide the dataset into two parts: Training set (70%) and Testing set (30%). We may run the main method several times to get the average results. 

Below is the accurency FYI.

> Round 1: 0.9767441860465116
 
> Round 2: 0.9302325581395349

> Round 3: 0.9534883720930233

> Round 4: 0.9767441860465116

> Round 5: 1

> Round 6: 0.9302325581395349

> Average: 0.96

You can switch to use Manhattan distance to have a try.

##Reference

**KNN:** https://en.wikipedia.org/wiki/KNN

**Euclidean distance:** https://en.wikipedia.org/wiki/Euclidean_distance

**Manhattan distance:** https://en.wikipedia.org/wiki/Taxicab_geometry

**Iris:** http://archive.ics.uci.edu/ml/datasets/Iris