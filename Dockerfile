FROM tomee:8-jre-7.1.0-plus
MAINTAINER Antoine Neveux <aneveux@protonmail.com>

ARG WAR_LOCATION
ADD ["$WAR_LOCATION", "/usr/local/tomee/webapps/rest-example.war"]

EXPOSE 8080
