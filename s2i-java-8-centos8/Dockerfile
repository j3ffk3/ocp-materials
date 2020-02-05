# s2i-java-8-centos8
FROM docker.io/centos:centos8 

# maintainer
LABEL maintainer="Jeff Ke <jeffk@tw.ibm.com>"

# environment variable
ENV APP_ROOT=/opt/app-root \
    MVN_CONFIG=/usr/share/maven/conf/settings.xml \
	TZ=Asia/Taipei

# Set labels used in OpenShift to describe the builder image
LABEL io.k8s.description="Platform for building java-11-application" \
      io.k8s.display-name="builder java-11" \
      io.openshift.expose-services="8080:http" \
      io.openshift.tags="builder,java-11." \
	  io.openshift.s2i.scripts-url="image:///usr/libexec/s2i"

# Install required packages
RUN useradd -u 1001 -g 0 default && \ 
yum install maven -y && \
yum clean all -y && \
mkdir -p  ${APP_ROOT} && \
chgrp -R 0 ${APP_ROOT} ${MVN_CONFIG} && \
chmod -R g=u ${APP_ROOT} ${MVN_CONFIG} 

# Copy the S2I scripts to /usr/libexec/s2i, since openshift/base-centos7 image
COPY ./s2i/bin/ /usr/libexec/s2i

# This default user is created in the openshift/base-centos7 image
USER 1001

# Set the default port for applications built using this image
EXPOSE 8080

# Set the default CMD for the image
CMD ["/usr/libexec/s2i/usage"]