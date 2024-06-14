FROM eclipse-temurin:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} Test-0.0.1-SNAPSHOT.jar
VOLUME /tmp
ARG JAR_FILE
ENTRYPOINT ["java","-jar","/Test-0.0.1-SNAPSHOT.jar"]