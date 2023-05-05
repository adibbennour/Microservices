FROM openjdk:8
EXPOSE 8761
ADD /target/EurekaServer-1.0.0.jar EurekaServer.jar
ENTRYPOINT [ "java", "-jar", "EurekaServer.jar" ]