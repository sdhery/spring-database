## spring database项目简介

1、添加多数据源，并通过AOP动态切换数据源功能
2、提供Mybatis的数据持久化功能
3、Druid数据库连接池及监控功能
4、添加Spring security Oauth2.0 进行身份验证
5、通过mvn assembly.xml, 添加Wrapper打包功能，可直接打包发布

Spring Security Oauth2.0的使用介绍：
过程如下：
1、（获得access_token和refresh_token, GET或Post方法）
http://127.0.0.1:8080/oauth/token?client_id=mobile_1&client_secret=secret_1&grant_type=password&username=aa&password=aa
2、（通过access_token进行访问，GET方法）
http://localhost:8080/admin/ds1?access_token=${access_token}
或
http://localhost:8080/admin/ds1?access_token=${access_token}
3、（通过refresh_token 进行刷新token，GET 或 Post方法）
http://localhost:8080/oauth/token?client_id=mobile_1&client_secret=secret_1&grant_type=refresh_token&refresh_token=${refresh_token}

注：在单机部署的环境下，将产生的token信息，直接保存到内存，便于单个节点访问，进行用户信息的认证。
<!--token在服务器存储的方式    InMemoryTokenStore ：保存在内存     ；JdbcTokenStore : 保存在数据库中 -->
<beans:bean id="tokenStore"
	class="org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore" />

注：在集群的部署环境下，需要将产生的token信息，保存到数据库，便于集群中不同的服务节点，进行用户信息的认证。
<!--token在服务器存储的方式    InMemoryTokenStore ：保存在内存     ；JdbcTokenStore : 保存在数据库中 -->
<beans:bean id="tokenStore"
	class="org.springframework.security.oauth2.provider.token.store.JdbcTokenStore" >
	 <beans:constructor-arg index="0" ref="dataSource"/>
</beans:bean>