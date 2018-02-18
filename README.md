# SSH

## SSH整合学习项目
---
```
Spring版本：spring-framework-5.0.3.RELEASE  
Struts2版本：struts-2.5.14.1
Hibernate版本：hibernate-release-5.1.10.Final
```
---
1. Spring和Hibernate整合
    1. 在使用了Transaction情况下session使用getCurrentSession获取时，不需要begin和commit
    2. 如果报如下异常，检查是否在sessionFactory中配置了  current_session_context_class
        ```
        Could not obtain transaction-synchronized Session for current thread
        ```
    3. 全局Spring配置：
        ```
        <context:annotation-config/>
        <context:component-scan base-package="com.mrhu.ssh"/>
        <aop:aspectj-autoproxy/>
        ```
2. Spring和Struts2整合
    1. struts2向Spring拿Action
    2. 引入struts2-spring-plugin
    3. struts2读xml配置文件的顺序
    4. Web.xml中配置Spring的listener
        ```
        <listener>
            <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
        </listener>
        ```
    5. UserAction中userService使用注解注入,使用的时候直接用
    6. 注意Action要使用多例：
        ```
        @Scope("prototype")
        ```
