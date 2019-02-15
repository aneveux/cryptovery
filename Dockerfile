FROM tomee:8-jre-7.1.0-plus
LABEL maintainer="Antoine Neveux <aneveux@protonmail.com>"
LABEL description="Cryptovery application packaged from a tomee image.\
Cryptovery is a JEE application used as an example for a training course in University."
LABEL version="1.1"

ARG WAR_LOCATION
ADD ["$WAR_LOCATION", "/usr/local/tomee/webapps/cryptovery.war"]

EXPOSE 8080
