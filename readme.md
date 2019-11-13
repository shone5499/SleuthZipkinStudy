# SpringCloud+Sleuth+Zipkin学习
EurekaServer:服务注册中心

Service1/2/3/4分别是最简单的web服务，其中

Service1调用Service2,Service2调用Service3和Service4

注意：本例子中，由于springboot2.0开始官方就不推荐自己搭建ZipkinServer,
所以这里使用官方推荐的方式启动Zipkin服务，步骤如下：

获取最新发布的zipkin服务器，一个可执行的jar

curl -sSL https://zipkin.io/quickstart.sh | bash -s

然后启动它java -jar zipkin.jar,此方式是使用的传输方式是web

如果使用kafka+es，则启动方式为

java -DKAFKA_ZOOKEEPER=127.0.0.1:2181 -DSTORAGE_TYPE=elasticsearch -DES_HOSTS=http://127.0.0.1:9200 -jar zipkin-server-2.12.9-exec.jar


也可以通过docker来启动

docker run -d -p 9411:9411 openzipkin/zipkin

## zipkin主要包括四个模块：

Collector 接受或者收集各个应用传输的数据

Storage：负责存储接收到的数据，默认是存储在内存当中的，也可以支持存在MySQL当中

API：负责查询Storage中存储的数据，主要是提供给Web UI来使用

Web：主要是提供简单的web界面

本例子中zipkin的传输是使用的http，并且存在缓存中，在实际生产中可以使用mq或kafka结合Elasticsearch.


