FROM maven:3.5-jdk-8-alpine
ADD target/bCom_reports_service.jar bCom_reports_service.jar
ENTRYPOINT ["java","-jar","bCom_reports_service.jar"]