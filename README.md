[![Build Status](https://travis-ci.org/aneveux/cryptovery.svg?branch=master)](https://travis-ci.org/aneveux/project-tooling-sample)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=cryptovery&metric=alert_status)](https://sonarcloud.io/dashboard?id=cryptovery)
[ ![Download](https://api.bintray.com/packages/aneveux/maven/cryptovery/images/download.svg) ](https://bintray.com/aneveux/maven/cryptovery/_latestVersion)

# :memo::key: Cryptovery

This repository contains an example of a JEE project using some industrialized tooling.

The base of the source code actually comes from the [tomee examples](https://github.com/apache/tomee/tree/master/examples/rest-example), and is then completed with lots of industrialized tools to demonstrate how to set them up and use them.

This project is used as a resource for an university training session.

## Useful links

- [Git](https://git-scm.com/)
- [GitHub](http://github.com/)
- [OpenJDK](http://openjdk.java.net/)
- [Maven](http://maven.apache.org/)
- [Tomee examples](https://github.com/apache/tomee/tree/master/examples/rest-example)
- [Gitmoji](https://gitmoji.carloscuesta.me/)
- [Gitignore](https://www.gitignore.io/)
- [Travis CI](http://travis-ci.org/)
- [EditorConfig](https://editorconfig.org/)
- [SonarCloud](https://sonarcloud.io/)
- [Choose A License](https://choosealicense.com/)
- [Bintray](https://bintray.com/)
- [Maven License Plugin](http://code.mycila.com/license-maven-plugin/)
- [Docker](https://www.docker.com/)
- [Fabric8](http://maven.fabric8.io/)
- [Docker Hub](https://cloud.docker.com/repository/docker/aneveux/cryptovery/)

## Going further?

- [SDKMan](https://sdkman.io/)
- [SonarCloud in Travis](https://docs.travis-ci.com/user/sonarcloud/)

## Useful commands

- `mvn license:format` - updates licenses' headers on all files
- `mvn tomee:run` - starts a local tomee server with the project (accessible at `http://localhost:8080/rest-example/`)
- `docker build . -t test/rest-example:latest --build-arg WAR_LOCATION=target/rest-example.war` - builds locally a docker image from the `Dockerfile`
- `docker run -p 8888:8080 test/rest-example:latest` - runs the previously built docker image (accessible at `http://localhost:8888/rest-example`)
- `mvn clean package fabric8:build` - builds a docker image directly from Maven using your Dockerfile and the result of your Maven build
