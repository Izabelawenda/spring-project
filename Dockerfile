FROM openjdk:11

WORKDIR /app

COPY ./target/*.jar /app/

ENTRYPOINT ["sh", "-c", "java -jar $(ls *.jar)"]