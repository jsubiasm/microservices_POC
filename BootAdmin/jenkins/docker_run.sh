echo '--- INICIO docker_run.sh ---'
cd ./BootAdmin
sudo cp ./target/BootAdmin-0.0.1-SNAPSHOT.war ./docker/BootAdmin-0.0.1-SNAPSHOT.war
sudo docker stop boot-admin
sudo docker rm boot-admin
sudo docker image rm jsubiasm/boot-admin
cd ./docker
sudo docker build -t jsubiasm/boot-admin .
sudo docker run -d --restart unless-stopped --name boot-admin -p 10012:10012 -t jsubiasm/boot-admin
echo '--- FIN docker_run.sh ---'