# job-service

````
docker build -t job-service .
````

````
prateekashtikar@Prateeks-MacBook-Pro job-service % docker images
REPOSITORY    TAG       IMAGE ID       CREATED          SIZE
job-service   latest    e0b7704deb9a   52 seconds ago   131MB
mongo         latest    b5d7662188e5   2 weeks ago      700MB
prateekashtikar@Prateeks-MacBook-Pro job-service % 
````


````
docker-compose --profile=dev up

docker-compose --profile=dev down
````

# Another way to build images

````
mvn spring-boot:build-image
````