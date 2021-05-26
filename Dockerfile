FROM openjdk:11
MAINTAINER obrii.org
COPY target/YaroshchukNazar-01.jar YaroshchukNazar-01.jar
ENTRYPOINT ["java","-jar","/YaroshchukNazar-01.jar"]
