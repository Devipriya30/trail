FROM eclipse-temurin:17
COPY target/trail.jar trail.jar
CMD [ "java","-jar","trail.jar" ]