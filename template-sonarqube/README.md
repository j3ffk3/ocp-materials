# How To make this sonarqube template?

## Step1 login your okd by this command .

```
oc login -u {YOUR_USER_ID} -p ${YOUR_PASSWORD} ${MASTER_API}
```

## Step2 Go to openshift project.
```
oc project openshift 
```
## Step3 Import sonarqube image from docker hub
### Import sonarqube 
```
oc import-image sonarqube:latest  --from docker.io/sonarqube:latest  --confirm 
```
## Step4 Create a project to make sonarqube template
```
oc new-project make-sonarqube-template
```

## Step5 New app from the ImageStram(imported at step 3)
### new app
```
oc new-app --name sonarqube -i sonarqube
```
### create route
```
oc expose svc/sonarqube
```

## Step5 Export yaml by these commands
### export ImageStream resource
```
oc get is -o yaml
```
Please refer to before-clean/is.yaml
### export DeploymentConfig resource
```
oc get dc -o yaml
```
Please refer to before-clean/dc.yaml
### export Service resource
```
oc get svc -o yaml
```
Please refer to before-clean/svc.yaml
### export Route resource
```
oc get route -o yaml
```
Please refer to before-clean/route.yaml

## Step5 Clean yaml file(Remove runtime parameters)
### clean ImageStream resource
Please refer to after-clean/is-clean.yaml
### clean DeploymentConfig resource
Please refer to after-clean/dc-clean.yaml
### clean Service resource
Please refer to after-clean/svc-clean.yaml
### clean Route resource
Please refer to after-clean/route-clean.yaml

## Step6 Paste resources to raw-template.yaml by the following orders
is-clean > dc-clean > svc-clean > route-clean
The result refer to sonarqube-ephemeral.yaml

## Step7 Test the template
### Create test project 
```
oc new-project test-sonarqube-template
```
### New app by template 
```
oc new-app --template=sonarqube-ephemeral
```
### Access sonarqube



