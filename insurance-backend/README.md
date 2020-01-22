# Insurance Backend

## Get API author information access this URL
Endpoint
```
http://${YOUR_HOST}:8080/api-info
```
You will get the following message 
```
${AUTHOR} made this API, this is a mini insurance query API
```
${AUTHOR} should inject to OS environment.

## Get insurance plans
Endpoint
```
http://${YOUR_HOST}:8080/plans
```

## Get insurance plans by id 
Endpoint
```
http://${YOUR_HOST}:8080/plan/${id}
```

## Execute soanarqube code scan and UT(Unit Test) coverage
```
mvn clean package sonar:sonar -Dsonar.host.url=${YOUR_SONAR_HOST}
```


## H2 console
Endpoint
```
http://${YOUR_HOST}:8080/h2-console
```
JDBC URL
```
jdbc:h2:mem:insurance 
```
username
```
sa
```
password
```
mypass
```
