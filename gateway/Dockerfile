FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Koshman Vadim

ADD ./target/gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]
HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:4000/actuator/health || exit 1

EXPOSE 4000