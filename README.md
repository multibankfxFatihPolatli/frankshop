# frank's car hop

## Technologies
- Spring Boot 2.4.2
- Java 15
- MongoDB 4.2+
- Docker

## How to run?
- clone repository
- at the root of the directory the command below (you need to have Docker running on your pc)
```
    docker build --pull --rm -f "Dockerfile" -t frankshop:0.0.1
```
- after building Docker image run the command below
   
 ```
 docker run   --rm -it  -p 8080:8080/tcp -e MONGO_DB_URI=<mongo_db_uri> -e JWT_TOKEN_SECRET=<jwt_token_secret>  frankshop:0.0.1
 ```
- mongodburi example
```
   mongodb+srv://USERNAME:PASSWORD@cluster0.3lc71.mongodb.net/DBNAME
```
- you can also find a dump file called "dump.rar" including prepared data to restore in mongodb instance after extracting file to folder. restore command example:
```
   mongorestore --uri  mongodb+srv://USERNAME:PASSWORD@cluster0.3lc71.mongodb.net/DBNAME /dump
```
- you will need to create a jwt token with a secret and this secret should be pass to the application with JWT_TOKEN_SECRET variable. there is no login mechanism in application but in order to provide security, application request a valid jwt token to be able to get "userId" for some user specific actions like "Cart" actions. UserId is parsed from "subject" field of jwt token. you can create token from following link.
```
   http://jwtbuilder.jamiekurtz.com/
```
- there is swagger integration on application. Api documentation can be viewed from an UI and also as "openapi 3.0" format. after running application you can reach api documentation from following link
```
   http://localhost:8080/swagger-ui/
```
- prepared docker image

```
    docker push fatihpolatli/frankshop:0.0.1

    https://hub.docker.com/r/fatihpolatli/frankshop
```

