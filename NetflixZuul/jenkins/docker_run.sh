echo '--- INICIO docker_run.sh ---'
cd ./NetflixZuul
sudo cp ./target/NetflixZuul-0.0.1-SNAPSHOT.war ./docker/NetflixZuul-0.0.1-SNAPSHOT.war
sudo docker stop netflix-zuul
sudo docker rm netflix-zuul
sudo docker image rm jsubiasm/netflix-zuul
cd ./docker
sudo docker build -t jsubiasm/netflix-zuul .
sudo docker run -d --restart unless-stopped --name netflix-zuul -p 10009:10008 -t jsubiasm/netflix-zuul
echo '--- FIN docker_run.sh ---'