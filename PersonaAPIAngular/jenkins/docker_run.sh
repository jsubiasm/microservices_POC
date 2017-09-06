cd ./PersonaAPIAngular
sudo npm install
sudo ng build --environment=pruebas --progress=false
sudo cp -r ./dist ./docker
cd ./docker
sudo docker build -t jsubiasm/persona-api-angular .
sudo docker stop persona-api-angular
sudo docker rm persona-api-angular
sudo docker run -d --restart unless-stopped --name persona-api-angular -p 86:80 -t jsubiasm/persona-api-angular