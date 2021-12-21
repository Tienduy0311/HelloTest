FROM maven:3.6.3-openjdk-8

WORKDIR /opt/app

COPY . .

RUN mvn clean compile

CMD ["mvn", "spring-boot:run"]

