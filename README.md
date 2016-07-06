# upper-case-service
A simple REST microservice that returns the upper case value of a string.

To create Docker image: DOCKER_HOST=unix:///var/run/docker.sock mvn docker:build

DOCKER_HOST=unix:///var/run/docker.sock will allow the mvn process to connect to the Docker daemon.

To run the image: docker run -p 8080:8080 -t blueagility/uppercase-service
