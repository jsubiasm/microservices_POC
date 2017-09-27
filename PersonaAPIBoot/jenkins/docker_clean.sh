echo '--- INICIO docker_clean.sh ---'
cd ./PersonaAPIBoot
sudo rm -rf ./target
sudo rm -fr ./docker/PersonaAPIBoot-0.0.1-SNAPSHOT.war
echo '--- FIN docker_clean.sh ---'