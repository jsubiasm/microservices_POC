echo '--- INICIO docker_run.sh ---'
cd ./POCAngular
sudo rm -fr ./dist
sudo rm -fr ./docker/dist/
sudo npm install
sudo ng build --environment=pruebas --progress=false
sudo cp -r ./dist ./docker
sudo docker stop poc-angular
sudo docker rm poc-angular
sudo docker image rm jsubiasm/poc-angular
cd ./docker
sudo docker build -t jsubiasm/poc-angular .
sudo docker run -d --restart unless-stopped --name poc-angular -p 86:80 -t jsubiasm/poc-angular
echo '--- FIN docker_run.sh ---'