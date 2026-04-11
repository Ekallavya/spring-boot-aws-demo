FROM amazoncorretto:21
LABEL authors="MSR"
EXPOSE 8080
ADD target/spring-boot-aws-demo.jar spring-boot-aws-demo.jar
ENTRYPOINT ["java","-jar","/spring-boot-aws-demo.jar"]
