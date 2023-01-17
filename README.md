# Docker-From-Scratch-For-Spring-Developers-

```sh
docker system prune -af

docker system prune -f


Note:
--all ,   -a		Remove all unused images not just dangling ones
--filter		    Provide filter values (e.g. 'label=<key>=<value>')
--force , -f		Do not prompt for confirmation
--volumes		    Prune volumes
```


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

# List of containers
  
```
docker ps
  
  
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker run ubuntu
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker run ubuntu
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker run ubuntu

prateekashtikar@Prateeks-MacBook-Pro Prateek % docker ps -a
CONTAINER ID   IMAGE         COMMAND    CREATED         STATUS                     PORTS     NAMES
32e0838a8766   ubuntu        "bash"     6 seconds ago   Exited (0) 5 seconds ago             naughty_curran
7f413d4bf79a   ubuntu        "bash"     7 seconds ago   Exited (0) 6 seconds ago             crazy_boyd
eb42ddc10a83   ubuntu        "bash"     9 seconds ago   Exited (0) 8 seconds ago             sharp_pascal
697694fc0455   hello-world   "/hello"   9 minutes ago   Exited (0) 9 minutes ago             stoic_brown
prateekashtikar@Prateeks-MacBook-Pro Prateek %   
  
  
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker run ubuntu date
Tue Jan 17 08:23:18 UTC 2023
prateekashtikar@Prateeks-MacBook-Pro Prateek %  
  
  
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker run ubuntu ls  
bin
boot
dev
etc
home
lib
media
mnt
opt
proc
root
run
sbin
srv
sys
tmp
usr
var
prateekashtikar@Prateeks-MacBook-Pro Prateek %   
  

prateekashtikar@Prateeks-MacBook-Pro Prateek % docker ps -a
CONTAINER ID   IMAGE         COMMAND    CREATED              STATUS                          PORTS     NAMES
d2ad4cc8e0dc   ubuntu        "ls"       41 seconds ago       Exited (0) 40 seconds ago                 agitated_wing
0f7a9743af26   ubuntu        "date"     About a minute ago   Exited (0) About a minute ago             eager_hofstadter
32e0838a8766   ubuntu        "bash"     2 minutes ago        Exited (0) 2 minutes ago                  naughty_curran
7f413d4bf79a   ubuntu        "bash"     2 minutes ago        Exited (0) 2 minutes ago                  crazy_boyd
eb42ddc10a83   ubuntu        "bash"     2 minutes ago        Exited (0) 2 minutes ago                  sharp_pascal
697694fc0455   hello-world   "/hello"   11 minutes ago       Exited (0) 11 minutes ago                 stoic_brown
prateekashtikar@Prateeks-MacBook-Pro Prateek % 
```
  
```
docker run -it ubuntu

To start container interactive mode 
-i -> std-input
-t -> std-output / attached terminal
```
  
# Remove All containers
  
```
  prateekashtikar@Prateeks-MacBook-Pro Prateek % docker system prune -f
Deleted Containers:
d2ad4cc8e0dc5e4e7abe58f4f50d907e264879a28d7f4525f38e7df18b013013
0f7a9743af26f3d5ec878b1afda3fb9d848acea92a21e18d2ddbfc5928d3c670
32e0838a87663bc1092b5a866c5daefd1e3b57b074a4253d04ebe4ab07ecb443
7f413d4bf79ad564b7933716703fdda568e105ed4ebf90939051b578fda77d01
eb42ddc10a83b28a7afd69ebea32ac0117df06d1c63543f14597fd5010e849ad
697694fc0455a240e01486da553aca39abd27eda49ad9b032e6c977ec7cfb3cc

Total reclaimed space: 0B
prateekashtikar@Prateeks-MacBook-Pro Prateek % 
  
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED   STATUS    PORTS     NAMES
prateekashtikar@Prateeks-MacBook-Pro Prateek %   
```
  
<img width="904" alt="Screenshot 2023-01-17 at 2 02 19 PM" src="https://user-images.githubusercontent.com/54174687/212847931-6d4a8212-1c77-4bc8-a21e-0239b414226c.png">

```
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED         STATUS                          PORTS     NAMES
d61384369b97   ubuntu    "bash"    3 minutes ago   Exited (0) About a minute ago             stupefied_saha
prateekashtikar@Prateeks-MacBook-Pro Prateek % 
```
  
```
 prateekashtikar@Prateeks-MacBook-Pro Prateek % docker run -it --name=c1 ubuntu
root@d293268f53f2:/# exit
exit
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker ps -a
CONTAINER ID   IMAGE     COMMAND   CREATED          STATUS                     PORTS     NAMES
d293268f53f2   ubuntu    "bash"    23 seconds ago   Exited (0) 4 seconds ago             c1
d61384369b97   ubuntu    "bash"    5 minutes ago    Exited (0) 3 minutes ago             stupefied_saha

prateekashtikar@Prateeks-MacBook-Pro Prateek % docker start -ia stupefied_saha
root@d61384369b97:/# 
```  
  
# Stop and Kill conatiners
  
```
docker run -it --name=c1 ubuntu
  
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker stop c1
c1
  
OR
  
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker kill c1   -> exited immediatetly.
```
  
```
 docker exec [conatiner-name] [command]

To start a command on a running container 

run -> creates new container & executes the command
exec -> does the sililar thing on a running container 
```
  
```
  prateekashtikar@Prateeks-MacBook-Pro Prateek % docker ps 
CONTAINER ID   IMAGE     COMMAND   CREATED          STATUS          PORTS     NAMES
49561887f448   ubuntu    "bash"    38 seconds ago   Up 37 seconds             c1
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker exec c1 date            
Tue Jan 17 08:48:14 UTC 2023
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker exec c1 ls  
bin
boot
dev
etc
home
lib
media
mnt
opt
proc
root
run
sbin
srv
sys
tmp
usr
var
vinoth
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker exec -it c1 bash
root@49561887f448:/# 
```  

# nginx  
  
```
docker pull nginx
  
docker pull nginx:perl
  
docker run -p 80:80 nginx
```  
  
<img width="1115" alt="Screenshot 2023-01-17 at 2 33 44 PM" src="https://user-images.githubusercontent.com/54174687/212854880-7e49429f-3304-4021-ac0f-498187c2af55.png">

