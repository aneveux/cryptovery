FROM tomee:8-jre-7.1.0-plus

COPY target/rest-example.war /usr/local/tomee/webapps/rest-example.war
