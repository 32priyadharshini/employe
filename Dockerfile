FROM eclispe-temurin:17
COPY target/employee employee.jar
CMD ["java", "-jar", "employee.jar"]
