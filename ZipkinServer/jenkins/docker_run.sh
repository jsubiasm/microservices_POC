echo '--- INICIO docker_run.sh ---'
cd ./ZipkinServer
sudo cp ./target/ZipkinServer-0.0.1-SNAPSHOT.war ./docker/ZipkinServer-0.0.1-SNAPSHOT.war
sudo docker stop zipkin-server
sudo docker rm zipkin-server
sudo docker image rm jsubiasm/zipkin-server
cd ./docker
sudo docker build -t jsubiasm/zipkin-server .
sudo docker run -d --name zipkin-server -p 10014:10014 -t jsubiasm/zipkin-server
echo '--- FIN docker_run.sh ---'