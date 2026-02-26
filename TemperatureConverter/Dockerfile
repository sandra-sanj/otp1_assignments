FROM maven:latest
LABEL authors="sandra"

WORKDIR /app

COPY pom.xml .

COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/temperature_converter.jar"]
