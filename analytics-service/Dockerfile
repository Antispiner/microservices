FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Koshman Vadim

ADD ./target/analytics-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/analytics-service.jar"]

EXPOSE 6000