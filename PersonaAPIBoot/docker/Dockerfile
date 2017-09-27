FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD PersonaAPIBoot-0.0.1-SNAPSHOT.war PersonaAPIBoot-0.0.1-SNAPSHOT.war
RUN sh -c 'touch /PersonaAPIBoot-0.0.1-SNAPSHOT.war'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar -Dspring.profiles.active=pruebas /PersonaAPIBoot-0.0.1-SNAPSHOT.war" ]
