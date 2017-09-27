echo '--- INICIO docker_run.sh ---'
cd ./PersonaAPIBoot
sudo cp ./target/PersonaAPIBoot-0.0.1-SNAPSHOT.war ./docker/PersonaAPIBoot-0.0.1-SNAPSHOT.war
sudo docker stop persona-api-boot-01
sudo docker stop persona-api-boot-02
sudo docker rm persona-api-boot-01
sudo docker rm persona-api-boot-02
sudo docker image rm jsubiasm/persona-api-boot
cd ./docker
sudo docker build -t jsubiasm/persona-api-boot .
sudo docker run -d --name persona-api-boot-01 -P --network="host" -t jsubiasm/persona-api-boot
sudo docker run -d --name persona-api-boot-02 -P --network="host" -t jsubiasm/persona-api-boot
echo '--- FIN docker_run.sh ---'
