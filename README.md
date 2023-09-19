# Docker-From-Scratch-For-Spring-Developers-

run command always creates brand new conatiner and exec 

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
docker start -ia c1
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

--------------

# nginx  
  
```
docker pull nginx
  
docker pull nginx:perl
  
docker run -p 80:80 nginx

docker run -p 8080:80 nginx

docker run -p 8090:80 nginx
```  
  
<img width="1115" alt="Screenshot 2023-01-17 at 2 33 44 PM" src="https://user-images.githubusercontent.com/54174687/212854880-7e49429f-3304-4021-ac0f-498187c2af55.png">


<img width="1032" alt="Screenshot 2023-01-17 at 2 38 48 PM" src="https://user-images.githubusercontent.com/54174687/212856224-59d47898-02e1-496c-a9ef-a977aab0f1d7.png">

```
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker run -d -p 7070:80 nginx
d9648a10a5c99f3056b40eeffb45f3badb1d54a9d307a2d8227b34b4f3f5a1ac
prateekashtikar@Prateeks-MacBook-Pro Prateek % 
```

<img width="1008" alt="Screenshot 2023-01-17 at 2 40 43 PM" src="https://user-images.githubusercontent.com/54174687/212856628-db66d71d-9e77-41de-9ada-c59806333e8e.png">

```
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker ps 
CONTAINER ID   IMAGE     COMMAND                  CREATED              STATUS              PORTS                  NAMES
d9648a10a5c9   nginx     "/docker-entrypoint.…"   About a minute ago   Up About a minute   0.0.0.0:7070->80/tcp   nifty_golick

prateekashtikar@Prateeks-MacBook-Pro Prateek % docker kill d96 
d96

```

# Access container log

```
prateekashtikar@Prateeks-MacBook-Pro Prateek % docker logs d96
/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: Enabled listen on IPv6 in /etc/nginx/conf.d/default.conf
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2023/01/17 09:10:22 [notice] 1#1: using the "epoll" event method
2023/01/17 09:10:22 [notice] 1#1: nginx/1.23.3
2023/01/17 09:10:22 [notice] 1#1: built by gcc 10.2.1 20210110 (Debian 10.2.1-6) 
2023/01/17 09:10:22 [notice] 1#1: OS: Linux 5.15.49-linuxkit
2023/01/17 09:10:22 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2023/01/17 09:10:22 [notice] 1#1: start worker processes
2023/01/17 09:10:22 [notice] 1#1: start worker process 28
2023/01/17 09:10:22 [notice] 1#1: start worker process 29
2023/01/17 09:10:22 [notice] 1#1: start worker process 30
2023/01/17 09:10:22 [notice] 1#1: start worker process 31
172.17.0.1 - - [17/Jan/2023:09:10:38 +0000] "GET / HTTP/1.1" 200 615 "-" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36" "-"
2023/01/17 09:10:38 [error] 30#30: *1 open() "/usr/share/nginx/html/favicon.ico" failed (2: No such file or directory), client: 172.17.0.1, server: localhost, request: "GET /favicon.ico HTTP/1.1", host: "localhost:7070", referrer: "http://localhost:7070/"
172.17.0.1 - - [17/Jan/2023:09:10:38 +0000] "GET /favicon.ico HTTP/1.1" 404 555 "http://localhost:7070/" "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36" "-"
prateekashtikar@Prateeks-MacBook-Pro Prateek % 
```

--------

# Docker Volume Mapping 

<img width="794" alt="Screenshot 2023-09-19 at 6 25 34 PM" src="https://github.com/javaHelper/Docker-From-Scratch-For-Spring-Developers-/assets/54174687/6fa9ee2c-4343-4dbd-a4d2-5739d41c7130">
<img width="664" alt="Screenshot 2023-09-19 at 6 25 58 PM" src="https://github.com/javaHelper/Docker-From-Scratch-For-Spring-Developers-/assets/54174687/b0210c5f-9958-4019-ab0d-3c4758426164">
