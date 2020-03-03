# Feign Client demo

Get original demo and steps from [this](https://dzone.com/articles/service-integration-with-netflix-feign-and-ribbon) link.

1. Extract the content of this folder in local directory (lets assume it C:\feign-demos)

2. Download apache-maven-3.6.3 from this [link](http://apachemirror.wuchna.com/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.zip) and extract in `C:\` directory

3. Run following command to setup maven (Every Command prompt you open hereafter)

    ```bash
    $ set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_231
    $ set path=%path%;c:\apache-maven-3.6.3\bin
    $ set M2_HOME=c:\apache-maven-3.6.3
    ```

4.  Run following command to build and run first instance of service

    ```bash
    $ cd C:\feign-demos\account-identifier-service
    $ mvn package
    $ cd target
    $ java -jar account-identifier-service-1.0.0.jar --server.port=8091
    ```


5.  Run following commands in new command prompt window to run second instance

    ```bash
    $ cd C:\feign-demos\account-identifier-service\target
    $ java -jar account-identifier-service-1.0.0.jar --server.port=8092
    ```

6.  Build and run bank-service using new command prompt

    ```bash
    $ cd C:\feign-demos\bank-account-service
    $ mvn package
    $ cd target 
    $ java -jar bank-account-service-1.0.0.jar --server.port=8080
    ```

7.  Use postman to test the POST request

    ```yaml
    RequestType:    POST
    URL:            http://localhost:8080/bank-account
    RequestHeader:  
        Content-Type:   application/json
    Body:
        {
        "accountId": "B12345",
        "accountName": "Joe Bloggs",
        "accountType": "CURRENT_ACCOUNT",
        "accountBlance": 1250.38
       }
    ```






