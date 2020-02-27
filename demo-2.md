# Spring Boot Demo2

1. Launch eclipse with Spring Tools plugin OR Spring Tools 4 IDE
2. File Menu > New > Other 
    Search for "Spring Starter"

3.  Project details:
    
    ```yml
    Project:    Maven Project
    Language:   Java
    SpringBoot: 2.2.4
    Group:      com.lti
    Artifact:   demo-2
    Dependencies:   web, devtools, actuator
    ```

4.  Create a new HTML file 'index.html' inside `/src/main/resources/static`

    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="ISO-8859-1">
    <title>Spring Boot Web</title>
    </head>
    <body>
    <h2>Hello World!</h2>
    </body>
    </html>
    ```

5.  Open `src/main/resources/application.properties` file and add following line:

    ```ini
    server.port=3000
    ```