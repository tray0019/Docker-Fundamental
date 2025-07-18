#Use the OpenJDK 11 image as the base image
FROM openjdk:11

#Create a new app directory for my application files
RUN mkdir /app

#Copy the app files from host machine to image filesystem
COPY src/main/java/org/example/Main.java /app/org/example/Main.java

#Set the directory for executing future commands
WORKDIR /app

# Compile the Java file
RUN javac org/example/Main.java

#Run the Main class
CMD ["java","org.example.Main"]

