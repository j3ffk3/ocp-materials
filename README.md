# ocp-materials
Openshift Container Platform  experimental materials.

## [Demo-code] insurance-backend
A Java spring boot application .

## [Demo-code] insurance-frontend
An Angular frontend application .

## [Docker build] insurance-backend-docker-build
A demo shows docker build

## [Source To Image] s2i-angular-8-centos8
A angular builder image source file.It will make a builder Image by the following command.
- **DOCKER**
```
docker build -t s2i-angular-8-centos8:latest .
```
- **PODMAN**
```
podman build -t s2i-angular-8-centos8:latest .
```
## [Source To Image] s2i-java-8-centos8
A java builder image source file.It will make a builder Image by the following command.
- **DOCKER**
```
docker build -t s2i-java-8-centos8:latest .
```
- **PODMAN**
```
podman build -t s2i-java-8-centos8:latest .
```
## [Pipeline] example-pipeline 

## [Template] template-sonarqube
It contains the following items.Let you know how to build templates.
- before-clean : resources aren't cleaned yet.
- after-clean : resources are cleaned.
- raw-template.yaml : a basic template format.
- sonarqube-ephemeral.yaml : an available sonarqube template.

## [Template] template-elastic-stack
It contains the following items
- elastic-stack-ephemeral.yaml : an available elastic-stack template.

