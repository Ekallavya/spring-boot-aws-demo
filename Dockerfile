FROM amazoncorretto:17
LABEL authors="MSR"
ADD target/spring-boot-aws-demo.jar spring-boot-aws-demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/spring-boot-aws-demo.jar"]
