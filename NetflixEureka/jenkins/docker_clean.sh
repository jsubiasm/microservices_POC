echo '--- INICIO docker_clean.sh ---'
cd ./NetflixEureka
sudo rm -rf ./target
sudo rm -fr ./docker/NetflixEureka-0.0.1-SNAPSHOT.war
echo '--- FIN docker_clean.sh ---'