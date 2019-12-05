# s2i-spring-boot
FROM docker.io/maven:3.6.3-jdk-11-slim

# maintainer
LABEL maintainer="Jeff Ke <jeffk@tw.ibm.com>"

# Set labels used in OpenShift to describe the builder image
LABEL io.k8s.description="A basic spring boot S2I builder image" \
      io.k8s.display-name="Spring boot builder image" \
      io.openshift.expose-services="8080:http" \
      io.openshift.s2i.scripts-url="image:///usr/libexec/s2i"

# Install required packages :
# Example RUN yum install -y ... && yum clean all -y


# Copy the S2I scripts to /usr/libexec/s2i, since openshift/base-centos7 image
# sets io.openshift.s2i.scripts-url label that way, or update that label
COPY ./s2i/bin/ /usr/libexec/s2i

# Set the default CMD for the image
CMD ["/usr/libexec/s2i/usage"]
