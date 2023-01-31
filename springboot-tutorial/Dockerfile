FROM openjdk:17-alpine

#working directory
WORKDIR /app

#copy from your Host(PC, laptop) to container
COPY . .

# show all item in the app directory
RUN ls -ltr /app/

#Run this inside the image
RUN ./mvnw dependency:go-offline

#run inside container
CMD ["./mvnw", "spring-boot:run"]