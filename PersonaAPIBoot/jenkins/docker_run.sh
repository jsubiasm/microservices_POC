echo '--- INICIO docker_run.sh ---'
cd ./PersonaAPIBoot
sudo cp ./target/PersonaAPIBoot-1.0.0.jar ./docker/PersonaAPIBoot-1.0.0.jar
sudo docker stop persona-api-boot
sudo docker rm persona-api-boot
sudo docker image rm jsubiasm/persona-api-boot
cd ./docker
sudo docker build -t jsubiasm/persona-api-boot .
sudo docker run -d --restart unless-stopped --name persona-api-boot -P --network="host" -t jsubiasm/persona-api-boot
echo '--- FIN docker_run.sh ---'