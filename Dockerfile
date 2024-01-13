
FROM eclipse-temurin:17-jdk-focal

# This is the work directory of our code 
WORKDIR /app 

COPY .mvn/ ./.mvn

COPY mvnw pom.xml ./

RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]



