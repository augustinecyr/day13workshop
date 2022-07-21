# Day 13 Workshop

## Workshop Objective

The objective of this workshop is to write a simple address book. The
information from the address book will be saved in a local filesystem as text
file using Java IO package.

### Creating folders
1.  day13workshop  > new folder >  controllers
2.  day13workshop > new folder >  models
3.  day13workshop > new folder > services

###  application.properties / optional step
1. spring.thymeleaf.template-loader-path: classpath:/templates
2. spring.thymeleaf.suffix: .html
3. spring.thymeleaf.cache:  false

### Creating a service
1. add DatabaseService to services folder
2. add annotation @Service 

### Creating a model
1. Contact.java
2. add getter setter for all the variables

### Creating a view
1. AddContact.html with POST form method

### Creating a controller for Contact
1. ContactController.java

### Displaying the input
1. Differences between static page and using templates
2. Using a static page AddContact.html to add input and display on showcontact.html

### Extracting the input
1. GET contact by reading variable id

### Test Cases
1. create a FunctionTest.java
2. @SpringBootTest
3. readContact() checks if the file exist.
4. saveContact() checks if the inputs can be saved upon submit.

### Commands
1.  mvn spring-boot:run -Dspring-boot.run.arguments="--dataDir=/Users/Username/folder" <---- for MAC OS
2.  mvn spring-boot:run -Dspring-boot.run.arguments="--dataDir=c:/data" <----- for Windows
3.  mvn clean test
