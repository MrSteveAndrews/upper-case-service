#!/bin/sh

#Build and tag the image using the Dockerfile.  Pass in a tag as a parameter.  The CD server will pass in the pipeline count.
echo docker build -t blueagility/uppercase-service:$1 .
sudo docker build -t blueagility/uppercase-service:$1 .
echo docker tag blueagility/uppercase-service:$1 blueagility/uppercase-service:latest
sudo docker tag blueagility/uppercase-service:$1 blueagility/uppercase-service:latest

# Push the image to DockerHub
echo docker login -u $2 -p $3
sudo docker login -u $2 -p $3
echo docker push blueagility/uppercase-service:$1
sudo docker push blueagility/uppercase-service:$1
echo docker push blueagility/uppercase-service:latest
sudo docker push blueagility/uppercase-service:latest