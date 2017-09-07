echo '--- INICIO docker_run.sh ---'
cd ./PersonaAPIAngular
sudo rm -fr ./dist
sudo rm -fr ./docker/dist/
sudo npm install
sudo ng build --environment=pruebas --progress=false
sudo cp -r ./dist ./docker
sudo docker stop persona-api-angular
sudo docker rm persona-api-angular
sudo docker image rm jsubiasm/persona-api-angular
cd ./docker
sudo docker build -t jsubiasm/persona-api-angular .
sudo docker run -d --restart unless-stopped --name persona-api-angular -p 86:80 -t jsubiasm/persona-api-angular
echo '--- FIN docker_run.sh ---'