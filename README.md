# demo-mongodb
mongodb示例
环境window

1.mongdb下载:https://www.mongodb.com,服务从server下，gui可从Compass下载

http://dl.mongodb.org/dl/win32/x86_64可下载zip版

2.启动mongdb 服务：
mongod --dbpath c:\data\db

3.客户端启动 
mongo
就可以输入一些命令，进行测试

4.Spring cloud 进行集成

pom.xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
连接端：
spring.data.mongodb.uri=mongodb://localhost:27017/test
使用端：
1.定义接口，如果业务比较简单，不需要定义方法，其父方法直接可用
public interface  MongoDataRepository extends MongoRepository<MongoData,String> {}
2.    @Autowired
      MongoRepository<MongoData,String> mongoDataRepository ;
      注入即可使用，MongoData为对象，String为ID类型
保存成功后，数据可查出。

