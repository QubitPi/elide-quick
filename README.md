[ ![Automated Build Badge](https://img.shields.io/badge/docker%20build-automated-blue.svg??longCache=true&style=for-the-badge) ](https://hub.docker.com/r/qubitpi/elide-quick/builds/) [ ![Build Status](https://img.shields.io/badge/docker%20build-passing-brightgreen.svg?longCache=true&style=for-the-badge) ](https://hub.docker.com/r/qubitpi/elide-quick/builds/) [ ![License Badge](https://img.shields.io/badge/License-Apache%202.0-orange.svg?longCache=true&style=for-the-badge) ](https://www.apache.org/licenses/LICENSE-2.0)

# [elide-standalone](https://github.com/yahoo/elide/tree/master/elide-standalone) docker image

![](https://elide.io//assets/images/elide-white-logo.png)

You got this [awesome tutorial out there which teaches you how to set up a simple Elide](https://github.com/yahoo/elide/tree/master/elide-standalone).

Two days later you accidentally trashed & deleted your code and "Oops..."

Well you really don't want to repeat it again especially you got only 3 minutes left before demoing your code to your manager, but you probably got few seconds to do little copy & paste like this

    docker pull qubitpi/elide-quick
    docker run --name elide -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=elide -e MYSQL_USER=elide -e MYSQL_PASSWORD=elide123 -p 8080:8080 -d qubitpi/elide-quick
    docker exec -it elide bash

And lastly inside container:
    
cd /elide-quick && mvn clean package && cd target && java -jar ElideQuick-1.0-SNAPSHOT.jar
    
There you go. Here is how you can spin up an [elide-standalone](https://github.com/yahoo/elide/tree/master/elide-standalone) using just few quick seconds(Did I just save your job?). [Enjoy](https://github.com/yahoo/elide/tree/master/elide-standalone#query-your-service)!

Database should be accessible inside container via

    mysql -h localhost -u elide -p
    elide123

## License
The use and distribution terms for this software are covered by the Apache License, Version 2.0 ( http://www.apache.org/licenses/LICENSE-2.0.html ).
