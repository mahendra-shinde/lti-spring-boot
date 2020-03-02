# Discovery Client Application to register self with Eureka Server

1. Create a new Spring Boot Starter Project

    ```yml
    ProjectName:    find-state
    Version:        8
    Packaging:      JAR
    Dependencies:   eureka-client, web, actuator
    ```

3.  Open the `src/main/resources/application.properties` and add few properties:

    ```ini
    ## False for SERVER, true for Client
    eureka.client.register-with-eureka=true
    eureka.client.fetch-registry=true
    ## Get Port dynamically assigned
    server.port=0
    eureka.client.service-url.defaultZone=http://localhost:8761/eureka
    spring.application.name=find-state
    ## Only required for multi-instances of this application
    eureka.instance.instance-id=${spring.application.name}:${random.int[1,9999]}
    ```

4.  Open the only Java file `FindStateApplication.java` and add class-level annotation
    `@EnableEurekaClient`

5.  Save all and Run the application at least twice.

6.  Verify Eureka Dashboard at `http://localhost:8761`
