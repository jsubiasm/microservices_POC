echo '--- INICIO docker_clean.sh ---'
cd ./NetflixZuul
sudo rm -rf ./target
sudo rm -fr ./docker/NetflixZuul-0.0.1-SNAPSHOT.war
echo '--- FIN docker_clean.sh ---'