# Docker Fundamental

## Step Took
1. Created Java Project
2. Added Dockerfile
3. Build Docker images
4. Use the terminal to build the images - [docker build -t main:1.0]
5. Run in a docker container [docker run main:1.0]
6. Execute [docker images] to see lists of images
7. Execute [docker run main:1.0] create a new container and print the messages. Running from docker container.
8. Run [docker ps] to see running list of container
9. Run [docker ps -a] for non-run and running container
10. Update my main class
11. Re-build project. (For docker)
12. build the images - [docker build -t main:2.0] - less time run
13. run [docker run -d main:2.0] - running cached mode using -d. Container start and run at the background without taking console window without printing every 2 sec.
14. Command executes, starts the container in the background with container output id
15. Run [docker ps]output 1 container in list 
16. Run [docker run -d main:2.0] again
17. Check [docker ps] - 2 container output
18. Run [docker log "containerId"] - Result with Main output- conatiner in iteration 149
19. 


## Learned
Difference between COPY and RUN
- RUN only applies to images
- COPY the first argument applies to the 
host machine while the second argument applies to images

Dockerfile can have multiple RUN commands



Self-thought 
url: https://www.youtube.com/watch?v=FzwIs2jMESM