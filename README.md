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

### Commands
1.  mvn spring-boot:run -Dspring-boot.run.arguments="--dataDir=/Users/Username/data" <---- for MAC OS
2.  mvn spring-boot:run -Dspring-boot.run.arguments="--dataDir=c:/data" <----- for Windows
