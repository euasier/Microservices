FROM openjdk:8-jdk-alpine
ARG JAR_FILE=./eurekaserver-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["sh","-c","java ${JAVA_OPTS} -jar app.jar"]

