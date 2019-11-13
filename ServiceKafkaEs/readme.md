# SpringCloud+Zipkin+Kafka+ElasticSearch

####1、启动Zookeeper
####2、启动Kafka
####3、启动ElasticSearch
####4、启动ZipkinServer
java -DKAFKA_ZOOKEEPER=127.0.0.1:2181 -DSTORAGE_TYPE=elasticsearch -DES_HOSTS=http://127.0.0.1:9200 -jar zipkin-server-2.12.9-exec.jar

引入kafka，并且在properties中配置kafka，修改数据传递方式为kafka

本模块中只是简单的实现了SpringCloud+Zipkin+Kafka+ElasticSearch，在springcloud中的其他模块
没有把配置改成这样，所以在ZipkinUI中显示不了其他的module，想实现完整的，应当在其他的模块中都
按照此模块的properties配置上.
