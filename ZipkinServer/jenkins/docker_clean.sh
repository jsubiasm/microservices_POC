echo '--- INICIO docker_clean.sh ---'
cd ./ZipkinServer
sudo rm -rf ./target
sudo rm -fr ./docker/ZipkinServer-0.0.1-SNAPSHOT.war
echo '--- FIN docker_clean.sh ---'