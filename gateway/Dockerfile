FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Koshman Vadim

ADD ./target/gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 4000