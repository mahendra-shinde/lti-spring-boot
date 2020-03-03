# Config Server Demo

1. Install git from https://git-scm.com

2. Configure git with Username and EMail Address

    ```bash
    $ git config --global user.name "Mahendra Shinde"
    $ git config --global user.email "MahendraShinde@synergetics-india.com"
    ```

3.  Once configured, creat a local git repository for project configuration

    ```bash
    $ d:
    $ mkdir git
    $ cd git
    $ git init my-config
    $ cd my-config
    $ notepad hello.properties
    ```

4.  Add following message in "hello.properties" file. Save and close notepad.

    ```ini
    message=hello world
    ```

5.  Switch back to command prompt (from step# 3) and run following:

    ```bash
    $ git add .
    $ git commit -m "First"
    ```

6.  Now, Run project "my-config-srv" and test following URL from browser:
    `http://localhost:8888/hello/default`

    Username: admin
    Password: admin@1234

7.  Now, Run project "my-config-client" and test following URL from browser:

    `http://localhost:8080/`