echo '--- INICIO docker_run.sh ---'
cd ./NetflixHystrix
sudo cp ./target/NetflixHystrix-0.0.1-SNAPSHOT.war ./docker/NetflixHystrix-0.0.1-SNAPSHOT.war
sudo docker stop netflix-hystrix
sudo docker rm netflix-hystrix
sudo docker image rm jsubiasm/netflix-hystrix
cd ./docker
sudo docker build -t jsubiasm/netflix-hystrix .
sudo docker run -d --name netflix-hystrix -P --network="host" -t jsubiasm/netflix-hystrix
echo '--- FIN docker_run.sh ---'