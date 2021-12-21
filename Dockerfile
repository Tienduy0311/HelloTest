FROM maven:3.6.3-openjdk-8

WORKDIR /opt/app

COPY . .

RUN mvn clean package -DskipTests

RUN ls

CMD ["java", "-jar", "target/backend.jar"]

