FROM openjdk:17
EXPOSE 8761
COPY target/*.jar user-prod-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/user-prod-0.0.1-SNAPSHOT.jar"]