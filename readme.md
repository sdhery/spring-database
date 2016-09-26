## Spring-database项目简介
0、基于Springboot框架开发，基础了druid，Mybatis等开源框架\n
1、提供多数据源切换功能，使用spring AOP进行数据源的切换操作\n
2、提供了REST服务接口功能（后期需要Spring Security Oauth2.0 进行安全认证）\n
3、提供Mybatis持久化层\n
4、提供服务打包成tar.gz,可以直接进行打包，部署到服务器上即可\n

## Spring-database项目运行
1、mvn clean && mvn package -Dmaven.test.skip\n
2、编译成功后，会在 target目录下面生成一下代码\n
3、spring-database-1.0.0-assembly.tar.gz\n
4、直接发布到 Linux服务器上，配置好数据库信息 \n
5、tar -zxvf spring-database-1.0.0-assembly.tar.gz\n

6、linux赋予文件运行权限\n
chmod -R u+x spring-database-1.0.0\n
7、启动服务\n
 cd bin\n
./spring-database start\n