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
  
  
  
