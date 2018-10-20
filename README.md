# My Statistics

This project provides a java library for the calculation of statistical values for arrays or lists. Moreover, it provides the following statistics:
* Minimum value
* Maximum value
* Mean value
* Median value
* Standard deviation

Also, this project provides an implementation of the Ascending Minima Algorithm.
You may find information of this algorithm [here](http://softwarelearner.blogspot.com/2011/04/minima-in-sliding-window.html)

## Prerequisites

The following tools should be available in order to build the project:
* Maven 3.5.4
* Java jdk11

## Build

To build the project, you need to run the following mvn command in the $ProjectBaseDir:

```
mvn clean install
```

where $ProjectBaseDir=The directory which contains the pom.xml

## Generate Javadoc

To generate the Java documentation, execute the following command in the $ProjectBaseDir:

```
mvn javadoc:javadoc
```

The documentation will be generated at the $ProjectBaseDir/site/apidocs

## Built With

The following tools were used for the implementation of the library:
* Java jdk11
* JetBrains IntelliJ v2018.3
* Maven 3.5.4
* Junit v5
* Guava math library

## Current Version
The project is currently on v1.0

## Authors

**Thanasis Nakopoulos**
