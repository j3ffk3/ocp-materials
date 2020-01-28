# base image
FROM docker.io/centos:latest

# build environment
ENV SRC_ROOT=/tmp/ocp-materials/insurance-backend \
	APP_ROOT=/opt/app-root \
	MAVEN_REPO=/root/.m2 

# matainer
MAINTAINER Jeff Ke

# Install required packages and create required dirctory.
RUN yum install java-1.8.0-openjdk -y  && \
	yum install maven -y  && \
	yum install git -y && \
	mkdir -p  ${APP_ROOT} && \
	chgrp -R 0 ${APP_ROOT} && \
	chmod -R g=u ${APP_ROOT}

# tmp as build app dirctory	
WORKDIR /tmp

# clone source 	
RUN git clone https://github.com/j3ffk3/ocp-materials.git 

# go to source dirctory to build app
WORKDIR ${SRC_ROOT}

# build the app and clean up packages
RUN mvn clean package && \
	yum clean all -y && \
	rm -rf ${MAVEN_REPO} && \	
	cp ${SRC_ROOT}/target/*.jar ${APP_ROOT}/app.jar 

# use the 1001 user to run the app
USER 1001

# go to rumtime dirctory
WORKDIR ${APP_ROOT}

# launch the jar file
ENTRYPOINT ["java","-Xmx512m","-Xms256m","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]



