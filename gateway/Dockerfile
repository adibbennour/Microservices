FROM openjdk:8
EXPOSE 8762
ADD /target/gateway-1.0.0.jar gateway.jar
ENTRYPOINT [ "java", "-jar", "gateway.jar" ]