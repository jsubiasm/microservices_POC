FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD ZipkinServer-0.0.1-SNAPSHOT.war ZipkinServer-0.0.1-SNAPSHOT.war
RUN sh -c 'touch /ZipkinServer-0.0.1-SNAPSHOT.war'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar -Dspring.profiles.active=pruebas /ZipkinServer-0.0.1-SNAPSHOT.war" ]
