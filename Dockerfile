FROM openjdk:17
EXPOSE 8080
ADD target/my-docker-image.jar my-docker-image.jar
ENTRYPOINT ["java","-jar","/my-docker-image.jar"]


