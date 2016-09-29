FROM frolvlad/alpine-oraclejdk8:slim

VOLUME /tmp
ADD target/uppercase-service.jar uppercase-service.jar
ENTRYPOINT ["java", "-jar", "uppercase-service.jar"]



