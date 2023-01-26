# docker-tutorial
1. Docker là gì?
- Docker là một phần mềm nguồn mở được thiết kế để hỗ trợ và đơn giản hóa việc phát triển ứng dụng. 
- Nó là một tập hợp các platform-as-a-service products tạo ra các virtualized environments độc lập để building, deploy , và testing các ứng dụng.

2. Download and Install docker
- Cho mac
https://docs.docker.com/desktop/install/mac-install/
- Cho Win 
https://docs.docker.com/desktop/install/windows-install/

sau khi cài đặt nếu có lỗi 
 "http://%2F%2F.%2Fpipe%2Fdocker_engine/v1.24/version": open //./pipe/docker_engine: The system cannot find the file specified. 

 ===> 
With Powershell: 
Open Powershell as administrator 
 Launch command: _& 'C:\Program Files\Docker\Docker\DockerCli.exe' -SwitchDaemon_

OR, with cmd: 
Open cmd as administrator  
 Launch command: _"C:\Program Files\Docker\Docker\DockerCli.exe" -SwitchDaemon_

Revole error: "no matching manifest for windows/amd64 xxx in the manifest list entries."
===>
 1. Go to Docker configurations
 2. Go to the Docker Engine tab
 3. Change the line **"experimental": false** to **"experimental": true**

- Cho linux
https://docs.docker.com/desktop/install/linux-install/

3. Giới thiệu về Dockerfiles
- Là file script chứa các command khai báo các dependencies, và binary libraries và tạo ra 1 Docker image. 
- Câu lệnh để tạo ra 1 image từ Dockerfile là 
**_docker build_**

4. Giới thiệu về Docker image ( có thể gọi là snapshots )
- là file được tạo từ các thông tin khai báo trong Dockerfile,
chứa các source code, libraries, dependencies, tools và các files khác cần thiết cho một ứng dụng để chạy.
- Chúng đại diện cho một application và virtual environment của nó tại một thời điểm cụ thể. 
- Nó cho phép các developers test và thử nghiệm phần mềm trong điều kiện ổn định, thống nhất.

5. Giới thiệu về Container
- Là một run-time environment (là một image đang chạy) mà ở đó người dùng có thể chạy một ứng dụng độc lập.
- 

6. Pull Image từ docker hub : https://hub.docker.com/
_docker pull <image name from docker hub>_
  
7. Container hóa 1 application
  
  
