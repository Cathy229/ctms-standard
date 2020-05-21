安全框架说明：
	1.例子里面把授权功能关闭了，任何页面都放行了。添加权限验证的方法：SecurityManagerImpl.java 58行代码：boolean openLimit = true;
	2.登录页面的入口在IndexController中的login
	3.用户登录访问接口：SecurityManagerImpl.loadUserByUsername
	4.权限验证接口：SecurityManagerImpl.getRolesByResource(String)
	5.配置在SecurityConfiguration中设置
	
基本：
1.本服务将作为OMS系统的服务端。
2.所有的配置都写到application.properties里分好类。
3.开发注意事项
3.1 本项目各个业务对应的控制层和业务层都写在对应的包下。事物用注解开启。
3.2 通用工具类、cache相关写在common包下
3.3 所有的交互接口都使用com/sinotrans/oms/common/base/Response.java做返回值，web端统一按照此类型处理。
3.4 fros框架Mybatis中mapper文件的if条件判断以及SQL取值需要用"sqlCond."进行获取
3.5 使用远程服务调用框架Feign时，远程接口都存放在文件夹“remoteInterface”内，命名规则：被调用的controller+Remote，类似于MVC分层结构，尽量保持代码文件的直观易读。
3.6 oms标准服务端使用拦截器AuthenticationInterceptor拦截所有方法获取全局定义的参数accessToken获取redis中的用户信息，另外如果需要的对某个“数据库交互”的方法做进一步的登陆验证使用@VerificatAuthentication注解在方法或者类上即可切入该方法验证用户信息。