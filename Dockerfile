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
FROM adoptopenjdk/openjdk15
COPY --from=build /home/app/target/api-0.0.1-SNAPSHOT.jar /usr/local/lib/api.jar
EXPOSE 8080
ENTRYPOINT ["java","--enable-preview","-Denable-preview","-jar","/usr/local/lib/api.jar"]