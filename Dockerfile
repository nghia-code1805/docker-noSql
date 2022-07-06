FROM openjdk:8-jdk
ADD target/noSql-0.0.1-SNAPSHOT.jar nosql.jar
ENTRYPOINT ["java", "-jar", "noSql-0.0.1-SNAPSHOT.jar"]