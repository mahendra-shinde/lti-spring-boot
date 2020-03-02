# Discovery Server using Spring Cloud (Eureka Server/NetFlix OSS)

1. Create a new Spring Boot Starter Project

    ```yml
    ProjectName:    discovery-server
    Version:        8
    Packaging:      JAR
    Dependencies:   eureka-server
    ```

2.  Open the `src/main/resources/application.properties` and add few properties:

    ```ini
    ## False for SERVER, true for Client
    eureka.client.register-with-eureka=false
    eureka.client.fetch-registry=false
    server.port=8761
    ```

3.  Open the only Java file in project `DiscoveryServerApplication.java` and one Class-level
    annotation `@EnableEurekaServer`


4.  Save all files and run as Spring boot application.

