FROM adoptopenjdk:11-jre-hotspot
MAINTAINER Koshman Vadim

ADD ./target/eureka.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka.jar"]
HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8761/actuator/health || exit 1

EXPOSE 8761