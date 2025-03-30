FROM openjdk:17-alpine
ARG JAR_FILE=target/userregistrationsystem-1.0-SNAPSHOT.jar
ADD ${JAR_FILE} userregistration.jar
#ENTRYPOINT ["java", "jar", "/userregistration.jar"]
ENTRYPOINT ["java", "-jar", "userregistration.jar"]