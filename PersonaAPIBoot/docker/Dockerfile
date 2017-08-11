FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD /var/lib/jenkins/workspace/PersonaAPIAngular_TESTS/PersonaAPIBoot/target/PersonaAPIBoot-1.0.0.jar PersonaAPIBoot-1.0.0.jar
RUN sh -c 'touch /PersonaAPIBoot-1.0.0.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /PersonaAPIBoot-1.0.0.jar" ]
