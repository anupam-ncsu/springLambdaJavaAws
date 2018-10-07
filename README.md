# springLambdaJavaAws:master
Build a simple Java Spring REST api and deploy it in form of a docker contianer

# clone the project to your local directory
`git clone https://github.com/anupam-ncsu/springLambdaJavaAws.git `

# Build your project :  
`mvn clean install`

# build docker container:  
Assuming you have docker installed on your system (I used docker toolbox for windows)  
`docker build -t <containerName>:<tag>.`

# Run the container:  
`docker run -p 8080:8080 <containerName>:<tag>`

# Check if the API came up
`192.168.99.100:8080/getcolor`   
This IP is provided by docker when it runs. Most cases its this same one.  

# Docker stop Container
list all running contaniers  
`docker ps`  
stop the container that you want  
`docker stop <containerName>:<tag>`  
