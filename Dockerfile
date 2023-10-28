FROM openjdk:11
COPY ./target/caluculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","caluculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]