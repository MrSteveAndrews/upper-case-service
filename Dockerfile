FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /tmp
ADD target/*.jar uppercase-service.jar
ENTRYPOINT ["java", "-jar", "uppercase-service.jar"]



