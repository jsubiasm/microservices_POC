--- Ejecutar Swagger:

docker run -d -p 81:8080 swaggerapi/swagger-editor


--- Ejecutar Imposter (mock server):

cd /home/jsubiasm/microservices_POC
docker run -d -ti -p 82:8443 -v $(pwd)/imposter:/opt/imposter/config outofcoffee/imposter-openapi


--- Ejecutar Jenkins:

cd /home/jsubiasm/microservices_POC
docker run -d -p 83:8080 -p 50000:50000 -v $(pwd)/jenkins:/var/jenkins_home jenkins
User: admin
Pass: admin


--- Ejecutar RabbitMQ:

docker run -d --hostname rabbithost --name rabbitdemn rabbitmq:3
docker run -d --hostname rabbithost                   rabbitmq:3
docker run -d --hostname rabbithost --name rabbitmgmt -p 84:15672 rabbitmq:3-management
docker run -d --hostname rabbithost                   -p 84:15672 rabbitmq:3-management
User: guest
Pass: guest


--- Ejecutar MongoDB:

cd /home/jsubiasm/microservices_POC
docker run -d -p 27017:27017 --name mongodb -v $(pwd)/mongodb:/data/db mongo
docker run -d -p 27017:27017                -v $(pwd)/mongodb:/data/db mongo


--- Generar imagen docker:

cd /home/jsubiasm/microservices_POC/docker
docker build -t jsubiasm/microservices_poc .


--- Ejecutar imagen docker:

docker run -d -p 8080:8080 -t jsubiasm/microservices_poc


--- Ejecutar docker-compose:

cd /home/jsubiasm/microservices_POC/docker
docker-compose up -d

