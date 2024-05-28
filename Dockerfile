FROM openjdk:21
ADD target/spring-boot-monitoring.jar spring-boot-monitoring.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-monitoring.jar"]