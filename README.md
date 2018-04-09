# SpringRestTEST
Simple restful webservice made by following the tutorial at https://spring.io/guides/gs/rest-service/

built using maven
mvn spring-boot:run will run it

added an endpoint to look for the spring representation of colors 

ie
http://localhost:8080/Color?color=blue returns
{"id":0,"color":"java.awt.Color[r=0,g=0,b=255]"}
