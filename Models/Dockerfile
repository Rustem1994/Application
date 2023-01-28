FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/models-1.0-SNAPSHOT.jar
WORKDIR C:\Users\Win10Pro\Documents\Application\Application
COPY $(JAR_FILE) models-1.0-SNAPSHOT.jar
ENTRYPOINT [“java”,”-jar”,“app.jar”]