echo '--- INICIO docker_run.sh ---'
cd ./NetflixEureka
sudo cp ./target/NetflixEureka-0.0.1-SNAPSHOT.war ./docker/NetflixEureka-0.0.1-SNAPSHOT.war
sudo docker stop netflix-eureka
sudo docker rm netflix-eureka
sudo docker image rm jsubiasm/netflix-eureka
cd ./docker
sudo docker build -t jsubiasm/netflix-eureka .
sudo docker run -d --restart unless-stopped --name netflix-eureka -P --network="host" -t jsubiasm/netflix-eureka
echo '--- FIN docker_run.sh ---'