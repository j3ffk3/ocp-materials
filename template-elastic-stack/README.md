# How To use this template?

## Step1 login your okd by this command 

```
oc login -u {YOUR_USER_ID} -p ${YOUR_PASSWORD} ${MASTER_API}
```

## Step2 
oc import-image elasticsearch:7.5.1  --from docker.io/elasticsearch:7.5.1  --confirm 
oc import-image kibana:7.5.1  --from docker.io/kibana:7.5.1  --confirm 
## Step3 
oc create -f <>
## Step4 
oc new-app --template=elastic-stack-ephemeral
## Step5
oc delete all -l template=elastic-stack-ephemeral
