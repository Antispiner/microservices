FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Koshman Vadim

ADD ./target/eureka.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka.jar"]

EXPOSE 8761