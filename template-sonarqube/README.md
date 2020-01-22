# How To use this elastic-stack template?

## Step1 login your okd by this command .

```
oc login -u {YOUR_USER_ID} -p ${YOUR_PASSWORD} ${MASTER_API}
```

## Step2 Go to openshift project.
```
oc project openshift 
```
## Step3 Import the required images for elastic-stack (the example use 7.5.1)
### Import elasticsearch
```
oc import-image elasticsearch:7.5.1  --from docker.io/elasticsearch:7.5.1  --confirm 
```
### Import kibana
```
oc import-image kibana:7.5.1  --from docker.io/kibana:7.5.1  --confirm 
```

## Step4 Install thie template.
```
oc create -f elastic-stack-ephemeral.yaml
```

## Step5 Test this template
### Create a project
```
oc new-project elastic-stack-test
```
### New a app by template
```
oc new-app --template=elastic-stack-ephemeral
```

## Step6 Access the kibana use dev-tool ceate index and test data.

## Step7 Use the following command delete resources that created by template.  
### delete resources
```
oc delete all -l template=elastic-stack-ephemeral
```
### check all resources are deleted.
