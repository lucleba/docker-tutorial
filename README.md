# docker-tutorial
1. Docker là gì?
 	- Docker là một phần mềm nguồn mở được thiết kế để hỗ trợ và đơn giản hóa việc phát triển ứng dụng. 
 	- Nó là một tập hợp các platform-as-a-service products tạo ra các virtualized environments (container) độc lập để building, deploy , và testing các ứng dụng.
 	- reference document:  https://docs.docker.com/reference/
 	- túm cái quần là: Docker là công cụ tiêu chuẩn defactor dùng để tạo và quản lý container.
 	- (Câu hỏi là tại sao lại dùng container mà không dùng máy ảo? ).-> thế này thì phải xem lại kiến trúc của máy ảo và container rồi.
 	- Máy ảo được xem như là 1 máy tính độc lập (có cpu, ram, ổ cứng) được chia sẻ bởi máy local. được cài rất nhiều thứ mà có thể ứng dụng chả dùng đến, rồi là khi tiết lập máy ảo phải tinhs toán tài nguyên..., trường hợp chạy nhiều máy ảo, thì ram, cpu đâu cho lại '(
 	- Với container thì không cần phải cài đặt máy ảo, mà sử dụng vùng chứa tích hợp (OS built in / emulated container support). 
2. Download and Install docker desktop
	a) Cho mac
      https://docs.docker.com/desktop/install/mac-install/
	b) Cho Win 
	    https://docs.docker.com/desktop/install/windows-install/
	 - Enable Hyper-V using PowerShell: https://learn.microsoft.com/en-us/virtualization/hyper-v-on-windows/quick-start/enable-hyper-v
	 - install and enable WLS on windows: https://learn.microsoft.com/en-us/windows/wsl/install

		sau khi cài đặt nếu có lỗi 
		 + "http://%2F%2F.%2Fpipe%2Fdocker_engine/v1.24/version": open //./pipe/docker_engine: The system cannot find the file specified. 
		
		 - ===> With Powershell:
		 -  Open Powershell as administrator 
		 -  Launch command: _& 'C:\Program Files\Docker\Docker\DockerCli.exe' -SwitchDaemon_
		
		OR, with cmd: 
		- Open cmd as administrator  
		-  Launch command: _"C:\Program Files\Docker\Docker\DockerCli.exe" -SwitchDaemon_
		
		Revole error: "no matching manifest for windows/amd64 xxx in the manifest list entries."
		===>
		 1. Go to Docker configurations
		 2. Go to the Docker Engine tab
		 3. Change the line **"experimental": false** to **"experimental": true**

	c) Cho linux
		https://docs.docker.com/desktop/install/linux-install/  
		sudo usermod -aG docker $USER  
		sudo chown $USER /var/run/docker.sock  
		sudo chmod +x /var/run/docker.sock  
thay đổi folder mặc định của docker:
https://diegocarrasco.com/change-docker-data-directory-vps-optimization/

4. Docker Toolbox cho những máy không thể cài docker desktop
	- MacOS: https://github.com/docker-archive/toolbox/blob/master/docs/toolbox_install_mac.md
	- Windows: https://github.com/docker-archive/toolbox/blob/master/docs/toolbox_install_windows.md

5. Giới thiệu về Dockerfiles
	- Là file script chứa các command khai báo các dependencies, và binary libraries và tạo ra 1 Docker image. 
	- Câu lệnh để tạo ra 1 image từ Dockerfile là 
	**_docker build_**

6. Giới thiệu về Docker image ( có thể gọi là snapshots )
- là file được tạo từ các thông tin khai báo trong Dockerfile,
chứa các source code, libraries, dependencies, tools và các files khác cần thiết cho một ứng dụng để chạy.
- Chúng đại diện cho một application và virtual environment của nó tại một thời điểm cụ thể. 
- Nó cho phép các developers test và thử nghiệm phần mềm trong điều kiện ổn định, thống nhất.

6. Giới thiệu về Container
- Là một run-time environment (là một image đang chạy) mà ở đó người dùng có thể chạy một ứng dụng độc lập.
- 

7. Pull Image từ docker hub : https://hub.docker.com/
_docker pull <image name from docker hub>_
  
7. Container hóa 1 application
  
  
