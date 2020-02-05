# s2i-angular-8-centos8
FROM docker.io/centos:centos8 

# maintainer
LABEL maintainer="Jeff Ke <jeffk@tw.ibm.com>"

# Apache HTTP Server DocRoot
ENV DOCROOT=/var/www/html \
	TZ=Asia/Taipei


# Set labels used in OpenShift to describe the builder image
LABEL io.k8s.description="Platform for building angular-8-application" \
      io.k8s.display-name="builder angular-8" \
      io.openshift.expose-services="8080:http" \
      io.openshift.tags="builder,angular-8." \
	  io.openshift.s2i.scripts-url="image:///usr/libexec/s2i"

# Install required packages here: 
RUN useradd -u 1001 -g 0 default && \
yum install nodejs -y && \
npm install -g @angular/cli && \ 
yum install httpd -y && \
sed -i "s/Listen 80/Listen 8080/g" /etc/httpd/conf/httpd.conf  && \
yum clean all -y && \
# Modify permission
#mkdir /.npm && \
#chown -R 1001:1001 /.npm && \
chgrp -R 0 ${DOCROOT} /run/httpd /var/log/httpd && \
chmod -R g=u ${DOCROOT} /run/httpd /var/log/httpd


# Copy the S2I scripts to /usr/libexec/s2i, since openshift/base-centos7 image
# sets io.openshift.s2i.scripts-url label that way, or update that label
COPY ./s2i/bin/ /usr/libexec/s2i

# This default user is created in the openshift/base-centos7 image
USER 1001

# Set the default port for applications built using this image
EXPOSE 8080

# Set the default CMD for the image
CMD ["/usr/libexec/s2i/usage"]
