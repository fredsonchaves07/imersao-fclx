FROM maven:3-openjdk-17

WORKDIR /app

COPY . /app

EXPOSE 8081

RUN mvn clean package

ENTRYPOINT ["mvn", "spring-boot:run"]