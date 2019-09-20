FROM 39.107.137.112:9090/library/java:8
VOLUME /tmp
COPY target/lib/ ./lib/
ADD target/*.jar /app.jar
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]