# upper-case-service
A simple REST microservice that returns the upper case value of a string.

To create Docker image:

     DOCKER_HOST=unix:///var/run/docker.sock mvn docker:build

* DOCKER_HOST=unix:///var/run/docker.sock will allow the mvn process to connect to the Docker daemon.

To run the image:

     docker run -d -p 9090:8080 -t blueagility/uppercase-service

* Run in detached mode with -d
* Bind container port 8080 to host port 9090 with -p 9090:8080

Smoke test the REST service in your favorite browser:

     http://localhost:9090/upperCase/{value}

Examples:

     http://localhost:9090/upperCase/abcdef
     http://localhost:9090/upperCase/DE3h839d4hd238ih

