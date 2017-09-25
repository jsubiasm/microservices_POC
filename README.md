# microservices_POC

**Swagger**

	docker run -d --restart unless-stopped --name swagger-editor -p 10001:8080 swaggerapi/swagger-editor

**Imposter**

	cd /home/jsubiasm/microservices_POC
	docker run -d --restart unless-stopped --name imposter-openapi -ti -p 10002:8443 -v $(pwd)/imposter:/opt/imposter/config outofcoffee/imposter-openapi

**Jenkins**

	cd /home/jsubiasm/microservices_POC
	docker run -d --restart unless-stopped --name jenkins -p 10003:8080 -p 50000:50000 -v $(pwd)/jenkins:/var/jenkins_home jenkins
	User: admin
	Pass: admin

**RabbitMQ**

	docker run -d --restart unless-stopped --hostname rabbithost --name rabbitdaemn rabbitmq:3
	docker run -d --restart unless-stopped --hostname rabbithost --name rabbitmngmt -p 10004:15672 rabbitmq:3-management
	User: guest
	Pass: guest

**MongoDB**

	cd /home/jsubiasm/microservices_POC
	docker run -d --restart unless-stopped -p 27017:27017 --name mongo -v $(pwd)/mongodb:/data/db mongo

**MongoUI**

	docker run -d --restart unless-stopped -p 10005:8081 --name mongo-express --link mongo:mongo-express mongo-express
	User: admin
	Pass: pass

**Elasticsearch**

	docker run -d --restart unless-stopped -p 9200:9200 -p 9300:9300 -it --name elasticsearch elasticsearch

**Kibana**

	docker run -d --restart unless-stopped -p 5601:5601 -it --name kibana --link elasticsearch:elasticsearch kibana

**Logstash**

	docker run -d --restart unless-stopped -p 5000:5000 -it --name logstash logstash -e 'input { tcp { port => 5000 codec => "json" } } output { elasticsearch { hosts => ["192.168.56.101"] index => "micro-%{serviceName}"} }'

