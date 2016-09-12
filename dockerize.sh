#!/bin/sh

#Build and tag the image using the Dockerfile.  Pass in a tag as a parameter.  The CD server will pass in the pipeline count.
sudo docker build -t blueagility/uppercase-service:$1 .
sudo docker build -t blueagility/uppercase-service:latest .

# Push the image to DockerHub
sudo docker login -u $2 -p $3
sudo docker push blueagility/uppercase-service:$1
sudo docker push blueagility/uppercase-service:latest