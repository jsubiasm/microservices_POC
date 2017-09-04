#!/bin/bash

cd ../..
sudo cp ./PersonaAPIBoot/target/PersonaAPIBoot-1.0.0.jar ./PersonaAPIBoot/docker/PersonaAPIBoot-1.0.0.jar
cd ./PersonaAPIBoot/docker
sudo docker build -t jsubiasm/persona-api-boot .
sudo docker stop persona-api-boot
sudo docker rm persona-api-boot
sudo docker run -d --restart unless-stopped --name persona-api-boot -p 85:85 -t jsubiasm/persona-api-boot
