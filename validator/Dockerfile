FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar 
CMD echo "port is: $PORT"
ENTRYPOINT ["java","-jar","/app.jar"]