# Docker-From-Scratch-For-Spring-Developers-

```sh
docker system prune -af

docker system prune -f
```

Note:
--all ,   -a		Remove all unused images not just dangling ones
--filter		    Provide filter values (e.g. 'label=<key>=<value>')
--force , -f		Do not prompt for confirmation
--volumes		    Prune volumes

```
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker images
REPOSITORY   TAG       IMAGE ID   CREATED   SIZE
prateekashtikar@Prateeks-MacBook-Pro Prateek % 
```

```
docker run hello-world

prateekashtikar@Prateeks-MacBook-Pro Prateek % docker images
REPOSITORY    TAG       IMAGE ID       CREATED         SIZE
hello-world   latest    46331d942d63   10 months ago   9.14kB
prateekashtikar@Prateeks-MacBook-Pro Prateek % 
  

docker pull ubuntu  
  
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker images
REPOSITORY    TAG       IMAGE ID       CREATED         SIZE
ubuntu        latest    4c2c87c6c36e   5 weeks ago     69.2MB
hello-world   latest    46331d942d63   10 months ago   9.14kB
prateekashtikar@Prateeks-MacBook-Pro Prateek %  
```
