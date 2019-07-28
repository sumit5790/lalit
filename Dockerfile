FROM  8-jdk-alpine

WORKDIR /usr/app

ADD target/*.jar  /usr/app

CMD java -jar /usr/app/*.jar
