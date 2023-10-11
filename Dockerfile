FROM eclipse-temurin:18

WORKDIR /u/myapp

COPY app/build/libs/*.jar ./

CMD java -jar *.jar
