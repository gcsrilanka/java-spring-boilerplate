# Java Spring Boilerplate #

This reposiory is an extended version of Spring Starter project. 

## What is Included ##

- Mongo DB Configuration
- Maven Configuration
- Package Structure
- File Structure
- Sample REST API
- Pre Configured Beans
  
## Prerequisites ##

- Install and Set system variables for Maven
- Install and Set system variables for Java

## Preferred IDE ##

You can use any IDE you like. But this priject is created using Spring Tool Suite

## How To Run ##

- First thing you need to do is adding the mongo db url in **src/main/resources/application.properties**
- Smaple URL : mongodb+srv://{username}:{dbname}@cluster0-s20b7.azure.mongodb.net/test?retryWrites=true&w=majority
- Then Execute following commands inside the root folder

- > mvn clean install
- > mvn package
- > java -jar target/spring-boilerplate-0.0.1-SNAPSHOT.jar

## Run with Docker ##

- > mvn clean install
- > mvn package
- > docker build -t springio/gs-spring-boot-docker .
- > docker run -p 8080:8080 springio/gs-spring-boot-docker
