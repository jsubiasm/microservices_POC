echo '--- INICIO docker_clean.sh ---'
cd ./NetflixHystrix
sudo rm -rf ./target
sudo rm -fr ./docker/NetflixHystrix-0.0.1-SNAPSHOT.war
echo '--- FIN docker_clean.sh ---'