FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Koshman Vadim

ADD ./target/monitoring.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring.jar"]
HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:9898/actuator/health || exit 1

EXPOSE 9898