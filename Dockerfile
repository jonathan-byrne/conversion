FROM tomcat:8.0-alpine
LABEL maintainer="ayo.com"

ADD conversion.war /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]