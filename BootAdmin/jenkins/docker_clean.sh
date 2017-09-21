echo '--- INICIO docker_clean.sh ---'
cd ./BootAdmin
sudo rm -rf ./target
sudo rm -fr ./docker/BootAdmin-0.0.1-SNAPSHOT.war
echo '--- FIN docker_clean.sh ---'