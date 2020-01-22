oc project openshift

oc import-image elasticsearch:7.5.1  --from docker.io/elasticsearch:7.5.1  --confirm 
oc import-image kibana:7.5.1  --from docker.io/kibana:7.5.1  --confirm 

oc create -f <>

oc new-app --template=elastic-stack-ephemeral

oc delete all -l template=elastic-stack-ephemeral
