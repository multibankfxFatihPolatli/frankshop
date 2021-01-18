#
# Build stage
#
FROM maven:3.6.3-openjdk-15 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

#
# Package stage
#
ENV MONGO_DB_URI $MONGO_DB_URI
ENV JWT_TOKEN_SECRET $JWT_TOKEN_SECRET
FROM adoptopenjdk/openjdk15
COPY --from=build /home/app/target/api-0.0.1-SNAPSHOT.jar /usr/local/lib/api.jar
EXPOSE 8080
ENTRYPOINT java --enable-preview -jar /usr/local/lib/api.jar --spring.data.mongodb.uri=$MONGO_DB_URI --jwt.token.secret=$JWT_TOKEN_SECRET