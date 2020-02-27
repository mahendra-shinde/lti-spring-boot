# First Spring boot project

1. Visit website https://start.spring.io

2. Choose following options
    ```yml
    Project:    Maven Project
    Language:   Java
    SpringBoot: 2.2.4
    Group:      com.lti
    Artifact:   demo-1
    Dependencies:   web, devtools
    ```

3.  Click 'Generate' button to download project ZIP. You need to copy this ZIP and extract its contents somewhere in local disk.

4.  Open Command Prompt, Start -> CMD 

5.  Switch to folder where you have extracted the files and run following commands

    ```cmd
    $ cd demo-1
    ## list the files
    $ dir
    ## verify if it contains pom.xml file
    ## set JAVA_HOME
    $ set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_231
    $ mvnw.cmd compile
    ```

6.  Launch eclipse (new workspace is preferred )

7.  File Menu -> Import -> Existing Maven project 
        Click Browse button and locate the folder where ZIP was extracted


