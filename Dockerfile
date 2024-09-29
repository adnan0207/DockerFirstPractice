FROM openjdk

WORKDIR /home

EXPOSE 8087

COPY target/app-for-trying-docker-1.0.0.jar .

CMD ["java", "-jar", "app-for-trying-docker-1.0.0.jar"]