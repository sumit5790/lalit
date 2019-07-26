FROM  172.31.30.63:5000/java8

WORKDIR /usr/app

ADD target/*.jar  /usr/app

CMD java -jar /usr/app/*.jar
