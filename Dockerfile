FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar PracticaAPI5D-1.jar
ENTRYPOINT ["java","-jar","/PracticaAPI5D-1.jar"]
EXPOSE 8080
