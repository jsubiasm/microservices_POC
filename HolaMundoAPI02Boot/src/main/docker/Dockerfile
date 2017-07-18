FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD HolaMundoAPI-0.0.1-SNAPSHOT.war HolaMundoAPI.jar
RUN sh -c 'touch /HolaMundoAPI.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /HolaMundoAPI.jar" ]
