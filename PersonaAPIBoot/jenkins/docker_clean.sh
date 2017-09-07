echo '--- INICIO docker_clean.sh ---'
cd ./PersonaAPIBoot
sudo rm -rf ./target
sudo rm -fr ./docker/PersonaAPIBoot-1.0.0.jar
echo '--- FIN docker_clean.sh ---'