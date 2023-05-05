FROM openjdk:8
EXPOSE 8282
ADD /target/Ms1-gestionCredit.jar Ms1-gestionCredit.jar
ENTRYPOINT [ "java", "-jar", "Ms1-gestionCredit.jar" ]
