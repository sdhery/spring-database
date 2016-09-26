## Spring-database项目简介

1、提供多数据源切换功能
2、提供了REST服务接口功能
3、提供Mybatis持久化层
4、提供服务打包成tar.gz,可以直接进行打包，部署到服务器上即可

mvn clean && mvn package -Dmaven.test.skip
编译成功后，会在 target目录下面生成一下代码
spring-database-1.0.0-assembly.tar.gz