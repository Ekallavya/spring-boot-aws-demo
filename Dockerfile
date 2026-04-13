FROM amazoncorretto:17
LABEL authors="MSR"
# Set working directory inside the container
#WORKDIR /app
# Copy the compiled Java application JAR file into the container
##COPY ./target/spring-boot-aws-demo.jar /app
ADD target/spring-boot-aws-demo.jar spring-boot-aws-demo.jar
# Expose the port the Spring Boot application will run on
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java","-jar","/spring-boot-aws-demo.jar"]
