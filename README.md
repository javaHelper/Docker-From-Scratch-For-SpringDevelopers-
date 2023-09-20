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

-----

# Network Demo

```
Docker-Learnings % docker run --name=nginx nginx
Unable to find image 'nginx:latest' locally
latest: Pulling from library/nginx
155eab17d86c: Pull complete 
b890a6ab7ff7: Pull complete 
edde10874f47: Pull complete 
d1969d2f2b2a: Pull complete 
983d8b18b7de: Pull complete 
50d0a268cf0b: Pull complete 
4ff51b8992c4: Pull complete 
Digest: sha256:6926dd802f40e5e7257fded83e0d8030039642e4e10c4a98a6478e9c6fe06153
Status: Downloaded newer image for nginx:latest
/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: Enabled listen on IPv6 in /etc/nginx/conf.d/default.conf
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2023/09/20 04:51:45 [notice] 1#1: using the "epoll" event method
2023/09/20 04:51:45 [notice] 1#1: nginx/1.25.2
2023/09/20 04:51:45 [notice] 1#1: built by gcc 12.2.0 (Debian 12.2.0-14) 
2023/09/20 04:51:45 [notice] 1#1: OS: Linux 5.15.49-linuxkit
2023/09/20 04:51:45 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2023/09/20 04:51:45 [notice] 1#1: start worker processes
2023/09/20 04:51:45 [notice] 1#1: start worker process 28
2023/09/20 04:51:45 [notice] 1#1: start worker process 29
2023/09/20 04:51:45 [notice] 1#1: start worker process 30
2023/09/20 04:51:45 [notice] 1#1: start worker process 31
172.17.0.3 - - [20/Sep/2023:04:57:46 +0000] "GET / HTTP/1.1" 200 615 "-" "curl/7.81.0" "-"
```

```
Docker-Learnings % docker pull vinsdocker/util
Using default tag: latest
latest: Pulling from vinsdocker/util
e96e057aae67: Pull complete 
0f09a97e6dda: Pull complete 
21d55e4ee19d: Pull complete 
Digest: sha256:52b6fad81c3dc47ec6892d1f532fd9370b586691aea2413460b7b483886e7aa0
Status: Downloaded newer image for vinsdocker/util:latest
docker.io/vinsdocker/util:latest
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker ps 
CONTAINER ID   IMAGE     COMMAND                  CREATED              STATUS              PORTS     NAMES
ac11bafa7e5e   nginx     "/docker-entrypoint.…"   About a minute ago   Up About a minute   80/tcp    nginx
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run -it vinsdocker/util
WARNING: The requested image's platform (linux/amd64) does not match the detected host platform (linux/arm64/v8) and no specific platform was requested
root@4f334edaa0e5:/# ping nginx
ping: nginx: Name or service not known
root@4f334edaa0e5:/# ping google.com
PING google.com (142.250.192.78) 56(84) bytes of data.

^C
--- google.com ping statistics ---
32 packets transmitted, 0 received, 100% packet loss, time 31747ms

root@4f334edaa0e5:/# ping http://www.google.com
ping: http://www.google.com: Name or service not known
root@4f334edaa0e5:/# ping google.com
PING google.com (142.250.192.78) 56(84) bytes of data.
64 bytes from bom12s16-in-f14.1e100.net (142.250.192.78): icmp_seq=1 ttl=37 time=10.0 ms
64 bytes from bom12s16-in-f14.1e100.net (142.250.192.78): icmp_seq=2 ttl=37 time=15.5 ms
64 bytes from bom12s16-in-f14.1e100.net (142.250.192.78): icmp_seq=3 ttl=37 time=14.1 ms
^C
--- google.com ping statistics ---
4 packets transmitted, 3 received, 25% packet loss, time 3012ms
rtt min/avg/max/mdev = 10.033/13.206/15.496/2.316 ms
root@4f334edaa0e5:/# cat /etc/resolv.conf 
# DNS requests are forwarded to the host. DHCP DNS options are ignored.
nameserver 192.168.65.5
 root@4f334edaa0e5:/# exit
exit
```


<details open>
  <summary>Inspect_Data</summary>
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker inspect nginx
  
```json  
[
    {
        "Id": "ac11bafa7e5e5a8b59f0b7d86cd355b07bfda7ee1eee01947db59bfe9aef875f",
        "Created": "2023-09-20T04:51:45.39318463Z",
        "Path": "/docker-entrypoint.sh",
        "Args": [
            "nginx",
            "-g",
            "daemon off;"
        ],
        "State": {
            "Status": "running",
            "Running": true,
            "Paused": false,
            "Restarting": false,
            "OOMKilled": false,
            "Dead": false,
            "Pid": 2878,
            "ExitCode": 0,
            "Error": "",
            "StartedAt": "2023-09-20T04:51:45.763877464Z",
            "FinishedAt": "0001-01-01T00:00:00Z"
        },
        "Image": "sha256:91582cfffc2d0daa6f42adb6fb74665a047310f76a28e9ed5b0185a2d0f362a6",
        "ResolvConfPath": "/var/lib/docker/containers/ac11bafa7e5e5a8b59f0b7d86cd355b07bfda7ee1eee01947db59bfe9aef875f/resolv.conf",
        "HostnamePath": "/var/lib/docker/containers/ac11bafa7e5e5a8b59f0b7d86cd355b07bfda7ee1eee01947db59bfe9aef875f/hostname",
        "HostsPath": "/var/lib/docker/containers/ac11bafa7e5e5a8b59f0b7d86cd355b07bfda7ee1eee01947db59bfe9aef875f/hosts",
        "LogPath": "/var/lib/docker/containers/ac11bafa7e5e5a8b59f0b7d86cd355b07bfda7ee1eee01947db59bfe9aef875f/ac11bafa7e5e5a8b59f0b7d86cd355b07bfda7ee1eee01947db59bfe9aef875f-json.log",
        "Name": "/nginx",
        "RestartCount": 0,
        "Driver": "overlay2",
        "Platform": "linux",
        "MountLabel": "",
        "ProcessLabel": "",
        "AppArmorProfile": "",
        "ExecIDs": null,
        "HostConfig": {
            "Binds": null,
            "ContainerIDFile": "",
            "LogConfig": {
                "Type": "json-file",
                "Config": {}
            },
            "NetworkMode": "default",
            "PortBindings": {},
            "RestartPolicy": {
                "Name": "no",
                "MaximumRetryCount": 0
            },
            "AutoRemove": false,
            "VolumeDriver": "",
            "VolumesFrom": null,
            "CapAdd": null,
            "CapDrop": null,
            "CgroupnsMode": "private",
            "Dns": [],
            "DnsOptions": [],
            "DnsSearch": [],
            "ExtraHosts": null,
            "GroupAdd": null,
            "IpcMode": "private",
            "Cgroup": "",
            "Links": null,
            "OomScoreAdj": 0,
            "PidMode": "",
            "Privileged": false,
            "PublishAllPorts": false,
            "ReadonlyRootfs": false,
            "SecurityOpt": null,
            "UTSMode": "",
            "UsernsMode": "",
            "ShmSize": 67108864,
            "Runtime": "runc",
            "ConsoleSize": [
                0,
                0
            ],
            "Isolation": "",
            "CpuShares": 0,
            "Memory": 0,
            "NanoCpus": 0,
            "CgroupParent": "",
            "BlkioWeight": 0,
            "BlkioWeightDevice": [],
            "BlkioDeviceReadBps": null,
            "BlkioDeviceWriteBps": null,
            "BlkioDeviceReadIOps": null,
            "BlkioDeviceWriteIOps": null,
            "CpuPeriod": 0,
            "CpuQuota": 0,
            "CpuRealtimePeriod": 0,
            "CpuRealtimeRuntime": 0,
            "CpusetCpus": "",
            "CpusetMems": "",
            "Devices": [],
            "DeviceCgroupRules": null,
            "DeviceRequests": null,
            "KernelMemory": 0,
            "KernelMemoryTCP": 0,
            "MemoryReservation": 0,
            "MemorySwap": 0,
            "MemorySwappiness": null,
            "OomKillDisable": null,
            "PidsLimit": null,
            "Ulimits": null,
            "CpuCount": 0,
            "CpuPercent": 0,
            "IOMaximumIOps": 0,
            "IOMaximumBandwidth": 0,
            "MaskedPaths": [
                "/proc/asound",
                "/proc/acpi",
                "/proc/kcore",
                "/proc/keys",
                "/proc/latency_stats",
                "/proc/timer_list",
                "/proc/timer_stats",
                "/proc/sched_debug",
                "/proc/scsi",
                "/sys/firmware"
            ],
            "ReadonlyPaths": [
                "/proc/bus",
                "/proc/fs",
                "/proc/irq",
                "/proc/sys",
                "/proc/sysrq-trigger"
            ]
        },
        "GraphDriver": {
            "Data": {
                "LowerDir": "/var/lib/docker/overlay2/7df974ea8b3eb3d1b80643e43f53b1555fd417f8fa30d7bde907c88978965762-init/diff:/var/lib/docker/overlay2/deb103e577bcf3e25087e8b4dc6977e03f6f6c405649d6a4f882b8000014ee5c/diff:/var/lib/docker/overlay2/3f8474605e38c11787906452c3dbc189130a21ef09f6cb98084515e082e47b1c/diff:/var/lib/docker/overlay2/2de2f286a2f35773803aa1612d4bf7104707d566da953bb46bb57c200ed867f5/diff:/var/lib/docker/overlay2/0bb7f0260b4992777629f62cf7f6703160337f65d0dd0cd68297c23d5b67c6e0/diff:/var/lib/docker/overlay2/b2772b4e40e09b8bdfc66d49d3b3459f1158e523424ead0540609047558ba211/diff:/var/lib/docker/overlay2/54fb3007c1c059041495b2aa2c978cf9108b50fbc558cbb4f1e3425bc1d2fb42/diff:/var/lib/docker/overlay2/dc1b3833a6b729564a391789c7bb8d49fc6938b5427e5adc0d5b514154fc4391/diff",
                "MergedDir": "/var/lib/docker/overlay2/7df974ea8b3eb3d1b80643e43f53b1555fd417f8fa30d7bde907c88978965762/merged",
                "UpperDir": "/var/lib/docker/overlay2/7df974ea8b3eb3d1b80643e43f53b1555fd417f8fa30d7bde907c88978965762/diff",
                "WorkDir": "/var/lib/docker/overlay2/7df974ea8b3eb3d1b80643e43f53b1555fd417f8fa30d7bde907c88978965762/work"
            },
            "Name": "overlay2"
        },
        "Mounts": [],
        "Config": {
            "Hostname": "ac11bafa7e5e",
            "Domainname": "",
            "User": "",
            "AttachStdin": false,
            "AttachStdout": true,
            "AttachStderr": true,
            "ExposedPorts": {
                "80/tcp": {}
            },
            "Tty": false,
            "OpenStdin": false,
            "StdinOnce": false,
            "Env": [
                "PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin",
                "NGINX_VERSION=1.25.2",
                "NJS_VERSION=0.8.0",
                "PKG_RELEASE=1~bookworm"
            ],
            "Cmd": [
                "nginx",
                "-g",
                "daemon off;"
            ],
            "Image": "nginx",
            "Volumes": null,
            "WorkingDir": "",
            "Entrypoint": [
                "/docker-entrypoint.sh"
            ],
            "OnBuild": null,
            "Labels": {
                "maintainer": "NGINX Docker Maintainers \u003cdocker-maint@nginx.com\u003e"
            },
            "StopSignal": "SIGQUIT"
        },
        "NetworkSettings": {
            "Bridge": "",
            "SandboxID": "3a44e7d4258e1f111c6ee25581cbde5138eb3a0bceda9de7cb45136df8a47845",
            "HairpinMode": false,
            "LinkLocalIPv6Address": "",
            "LinkLocalIPv6PrefixLen": 0,
            "Ports": {
                "80/tcp": null
            },
            "SandboxKey": "/var/run/docker/netns/3a44e7d4258e",
            "SecondaryIPAddresses": null,
            "SecondaryIPv6Addresses": null,
            "EndpointID": "7dcfdf404cb35dedafbc125514a5ff0d6235424a283ee0e0257b0af7bd17abd2",
            "Gateway": "172.17.0.1",
            "GlobalIPv6Address": "",
            "GlobalIPv6PrefixLen": 0,
            "IPAddress": "172.17.0.2",
            "IPPrefixLen": 16,
            "IPv6Gateway": "",
            "MacAddress": "02:42:ac:11:00:02",
            "Networks": {
                "bridge": {
                    "IPAMConfig": null,
                    "Links": null,
                    "Aliases": null,
                    "NetworkID": "fb72946d3eff58f9b7129fac9437b6049793300cfb7c3b1a2dc85770ce90bc01",
                    "EndpointID": "7dcfdf404cb35dedafbc125514a5ff0d6235424a283ee0e0257b0af7bd17abd2",
                    "Gateway": "172.17.0.1",
                    "IPAddress": "172.17.0.2",
                    "IPPrefixLen": 16,
                    "IPv6Gateway": "",
                    "GlobalIPv6Address": "",
                    "GlobalIPv6PrefixLen": 0,
                    "MacAddress": "02:42:ac:11:00:02",
                    "DriverOpts": null
                }
            }
        }
    }
]
```json
</details>

```
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run -it vinsdocker/util
WARNING: The requested image's platform (linux/amd64) does not match the detected host platform (linux/arm64/v8) and no specific platform was requested
root@c6f716e8fd8f:/# ping 172.17.0.2
PING 172.17.0.2 (172.17.0.2) 56(84) bytes of data.
64 bytes from 172.17.0.2: icmp_seq=1 ttl=64 time=0.302 ms
64 bytes from 172.17.0.2: icmp_seq=2 ttl=64 time=0.399 ms
64 bytes from 172.17.0.2: icmp_seq=3 ttl=64 time=0.386 ms
64 bytes from 172.17.0.2: icmp_seq=4 ttl=64 time=0.463 ms
^C
--- 172.17.0.2 ping statistics ---
4 packets transmitted, 4 received, 0% packet loss, time 3013ms
rtt min/avg/max/mdev = 0.302/0.387/0.463/0.057 ms
root@c6f716e8fd8f:/# curl 172.17.0.2
<!DOCTYPE html>
<html>
<head>
<title>Welcome to nginx!</title>
<style>
html { color-scheme: light dark; }
body { width: 35em; margin: 0 auto;
font-family: Tahoma, Verdana, Arial, sans-serif; }
</style>
</head>
<body>
<h1>Welcome to nginx!</h1>
<p>If you see this page, the nginx web server is successfully installed and
working. Further configuration is required.</p>

<p>For online documentation and support please refer to
<a href="http://nginx.org/">nginx.org</a>.<br/>
Commercial support is available at
<a href="http://nginx.com/">nginx.com</a>.</p>

<p><em>Thank you for using nginx.</em></p>
</body>
</html>
root@c6f716e8fd8f:/#
```

-------

# Custom Bridge Demo

```
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker network create dummy
7c8ad8cf35ef736a7e6347dd6c534b390cb41d2ba536d3e07c7b5170b918e898
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % 
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker network ls
NETWORK ID     NAME      DRIVER    SCOPE
fb72946d3eff   bridge    bridge    local
7c8ad8cf35ef   dummy     bridge    local
5dec28ebada2   host      host      local
0944141c688e   none      null      local
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run --name=nginx --network=dummy nginx
/docker-entrypoint.sh: /docker-entrypoint.d/ is not empty, will attempt to perform configuration
/docker-entrypoint.sh: Looking for shell scripts in /docker-entrypoint.d/
/docker-entrypoint.sh: Launching /docker-entrypoint.d/10-listen-on-ipv6-by-default.sh
10-listen-on-ipv6-by-default.sh: info: Getting the checksum of /etc/nginx/conf.d/default.conf
10-listen-on-ipv6-by-default.sh: info: Enabled listen on IPv6 in /etc/nginx/conf.d/default.conf
/docker-entrypoint.sh: Sourcing /docker-entrypoint.d/15-local-resolvers.envsh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/20-envsubst-on-templates.sh
/docker-entrypoint.sh: Launching /docker-entrypoint.d/30-tune-worker-processes.sh
/docker-entrypoint.sh: Configuration complete; ready for start up
2023/09/20 05:07:07 [notice] 1#1: using the "epoll" event method
2023/09/20 05:07:07 [notice] 1#1: nginx/1.25.2
2023/09/20 05:07:07 [notice] 1#1: built by gcc 12.2.0 (Debian 12.2.0-14) 
2023/09/20 05:07:07 [notice] 1#1: OS: Linux 5.15.49-linuxkit
2023/09/20 05:07:07 [notice] 1#1: getrlimit(RLIMIT_NOFILE): 1048576:1048576
2023/09/20 05:07:07 [notice] 1#1: start worker processes
2023/09/20 05:07:07 [notice] 1#1: start worker process 29
2023/09/20 05:07:07 [notice] 1#1: start worker process 30
2023/09/20 05:07:07 [notice] 1#1: start worker process 31
2023/09/20 05:07:07 [notice] 1#1: start worker process 32
172.18.0.3 - - [20/Sep/2023:05:08:31 +0000] "GET / HTTP/1.1" 200 615 "-" "curl/7.81.0" "-"
```

```
docker run -it --network=dummy vinsdocker/util
WARNING: The requested image's platform (linux/amd64) does not match the detected host platform (linux/arm64/v8) and no specific platform was requested
root@a627cfdbb088:/# cat /etc/resolv.conf 
nameserver 127.0.0.11
options ndots:0
root@a627cfdbb088:/# ping nginx
PING nginx (172.18.0.2) 56(84) bytes of data.
64 bytes from nginx.dummy (172.18.0.2): icmp_seq=1 ttl=64 time=0.206 ms
64 bytes from nginx.dummy (172.18.0.2): icmp_seq=2 ttl=64 time=0.626 ms
^C64 bytes from 172.18.0.2: icmp_seq=3 ttl=64 time=0.362 ms

--- nginx ping statistics ---
3 packets transmitted, 3 received, 0% packet loss, time 2005ms
rtt min/avg/max/mdev = 0.206/0.398/0.626/0.173 ms
root@a627cfdbb088:/# curl nginx
<!DOCTYPE html>
<html>
<head>
<title>Welcome to nginx!</title>
<style>
html { color-scheme: light dark; }
body { width: 35em; margin: 0 auto;
font-family: Tahoma, Verdana, Arial, sans-serif; }
</style>
</head>
<body>
<h1>Welcome to nginx!</h1>
<p>If you see this page, the nginx web server is successfully installed and
working. Further configuration is required.</p>

<p>For online documentation and support please refer to
<a href="http://nginx.org/">nginx.org</a>.<br/>
Commercial support is available at
<a href="http://nginx.com/">nginx.com</a>.</p>

<p><em>Thank you for using nginx.</em></p>
</body>
</html>
root@a627cfdbb088:/# 
```

# Building Hello World Image

# Dockerfile
```
FROM ubuntu

WORKDIR /vins/welcome

ADD welcome.txt welcome.txt

CMD cat welcome.txt
```


```
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker build -t my-hello-world .
[+] Building 6.1s (9/9) FINISHED                                                                                                                         
 => [internal] load build definition from Dockerfile                                                                                             0.0s
 => => transferring dockerfile: 126B                                                                                                             0.0s
 => [internal] load .dockerignore                                                                                                                0.0s
 => => transferring context: 2B                                                                                                                  0.0s
 => [internal] load metadata for docker.io/library/ubuntu:latest                                                                                 3.6s
 => [auth] library/ubuntu:pull token for registry-1.docker.io                                                                                    0.0s
 => [internal] load build context                                                                                                                0.0s
 => => transferring context: 90B                                                                                                                 0.0s
 => [1/3] FROM docker.io/library/ubuntu@sha256:aabed3296a3d45cede1dc866a24476c4d7e093aa806263c27ddaadbdce3c1054                                  2.3s
 => => resolve docker.io/library/ubuntu@sha256:aabed3296a3d45cede1dc866a24476c4d7e093aa806263c27ddaadbdce3c1054                                  0.0s
 => => sha256:aabed3296a3d45cede1dc866a24476c4d7e093aa806263c27ddaadbdce3c1054 1.13kB / 1.13kB                                                   0.0s
 => => sha256:94d12db896d07af18a04319f1023edd091629f558dcc29f84208a7cf5ca040ec 424B / 424B                                                       0.0s
 => => sha256:6a47e077731f534f14de4df8639e35a1792a555b74e46920200ec05cb4af3d12 2.32kB / 2.32kB                                                   0.0s
 => => sha256:20274425734a05472f3772bae7ce7124a9832f5eb168456d6cb53e92d6e718a8 27.35MB / 27.35MB                                                 1.6s
 => => extracting sha256:20274425734a05472f3772bae7ce7124a9832f5eb168456d6cb53e92d6e718a8                                                        0.6s
 => [2/3] WORKDIR /vins/welcome                                                                                                                  0.1s
 => [3/3] ADD welcome.txt welcome.txt                                                                                                            0.0s
 => exporting to image                                                                                                                           0.0s
 => => exporting layers                                                                                                                          0.0s
 => => writing image sha256:b6a81a882c2dd3eeee543c57929dbffc3b9d21eafd1edf1562051deebbf9e19e                                                     0.0s
 => => naming to docker.io/library/my-hello-world                                                                                                0.0s

prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker images
REPOSITORY       TAG       IMAGE ID       CREATED          SIZE
my-hello-world   latest    b6a81a882c2d   17 seconds ago   69.2MB
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world
Hello World !!!

I am learning Docker, so far great!%                                                                                                                     prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world
Hello World !!!

I am learning Docker, so far great!

prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker ps -a 
CONTAINER ID   IMAGE            COMMAND                  CREATED          STATUS                      PORTS     NAMES
161f302cd50d   my-hello-world   "/bin/sh -c 'cat wel…"   4 seconds ago    Exited (0) 3 seconds ago              naughty_bouman
e8eafe31a977   my-hello-world   "/bin/sh -c 'cat wel…"   17 seconds ago   Exited (0) 17 seconds ago             interesting_fermi
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % 
```

# Exploring Our Image 

```
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % vi Dockerfile 
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run -it my-hello-world bash
root@9aed97a1f4c3:/vins/welcome# ls -l
total 4
-rw-r--r-- 1 root root 52 Sep 20 05:12 welcome.txt
root@9aed97a1f4c3:/vins/welcome# exit
exit
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world
Hello World !!!

I am learning Docker, so far great!%                                                                                                                     prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world date
Wed Sep 20 05:27:08 UTC 2023
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world ls  
welcome.txt
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % 
```

--------

# Building Image with ENTRYPOINT

with ENTRYPOINT you can't override command line parameters 

```
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker build -t my-hello-world-new .
[+] Building 2.6s (9/9) FINISHED                                                                                                                         
 => [internal] load build definition from Dockerfile                                                                                             0.0s
 => => transferring dockerfile: 133B                                                                                                             0.0s
 => [internal] load .dockerignore                                                                                                                0.0s
 => => transferring context: 2B                                                                                                                  0.0s
 => [internal] load metadata for docker.io/library/ubuntu:latest                                                                                 2.5s
 => [auth] library/ubuntu:pull token for registry-1.docker.io                                                                                    0.0s
 => [1/3] FROM docker.io/library/ubuntu@sha256:aabed3296a3d45cede1dc866a24476c4d7e093aa806263c27ddaadbdce3c1054                                  0.0s
 => [internal] load build context                                                                                                                0.0s
 => => transferring context: 32B                                                                                                                 0.0s
 => CACHED [2/3] WORKDIR /vins/welcome                                                                                                           0.0s
 => CACHED [3/3] ADD welcome.txt welcome.txt                                                                                                     0.0s
 => exporting to image                                                                                                                           0.0s
 => => exporting layers                                                                                                                          0.0s
 => => writing image sha256:9bec6b9d7f7a93ec199cca7958fcf5fb69c5258341387385628c3f151817ffb8                                                     0.0s
 => => naming to docker.io/library/my-hello-world-new                                                                                            0.0s
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world-new
Hello World !!!

I am learning Docker, so far great!%                                                                                                                     prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world-new date
Hello World !!!

I am learning Docker, so far great!%                                                                                                                     prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-hello-world-new ls  
Hello World !!!

I am learning Docker, so far great!%                                                                                                                     prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % 
```

# Installing Java in Ubuntu container 

```
FROM ubuntu

WORKDIR /java

RUN apt-get update

RUN apt-get install curl -y

RUN curl https://download.java.net/java/GA/jdk17.0.2/dfd4a8d0985749f896bed50d7138ee7f/8/GPL/openjdk-17.0.2_linux-aarch64_bin.tar.gz --output java17.tar.gz

RUN tar -xvzf java17.tar.gz

RUN rm java17.tar.gz

ENV PATH $PATH:/java/jdk-17.0.2/bin
```

```
% docker build -t my-java-17 .
% docker run -it my-java-17
root@aea881ce5ba7:/java# java --version
openjdk 17.0.2 2022-01-18
OpenJDK Runtime Environment (build 17.0.2+8-86)
OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)
root@aea881ce5ba7:/java# javac --version
javac 17.0.2
root@aea881ce5ba7:/java# 
```


```
FROM ubuntu

WORKDIR /java

ADD https://download.java.net/java/GA/jdk17.0.2/dfd4a8d0985749f896bed50d7138ee7f/8/GPL/openjdk-17.0.2_linux-aarch64_bin.tar.gz java17.tar.gz

RUN tar -xvzf java17.tar.gz

RUN rm java17.tar.gz

ENV PATH $PATH:/java/jdk-17.0.2/bin
```

```
% docker build -t my-java-17 .
% docker run -it my-java-17
root@aea881ce5ba7:/java# java --version
openjdk 17.0.2 2022-01-18
OpenJDK Runtime Environment (build 17.0.2+8-86)
OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)
root@aea881ce5ba7:/java# javac --version
javac 17.0.2
root@aea881ce5ba7:/java# 
```

----------

```Dockerfile
FROM my-java-17

WORKDIR /user/vinoth/table

COPY Table.java Table.java

CMD javac Table.java && java Table
```

```
prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker build -t my-table .

prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run my-table 
Received input : null

prateekashtikar@Prateeks-MacBook-Pro Docker-Learnings % docker run -e input=3  my-table
Received input : 3
1 * 3 = 3 
2 * 3 = 6 
3 * 3 = 9 
```
------

# How to push images

```
docker push <IMAGE NAME>
```

# How to rename?

```
docker tag <IMAGE NAME> <NEW IMAGE NAME>:v1/v2 etc as per wish
```
