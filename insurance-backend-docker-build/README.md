# Use the following command to deploy to okd

## login to okd
```
oc login -u ${YOUR_USER} -p {YOUR_PASSWORD} ${MASTER_API}
```

## create app
```
oc new-app --name insurance-backend <git-url> --context-dir insurance-backend-docker-build
```

## expose service 

```
oc expose svc insurance-backend
```

