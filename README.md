# distributed_edu
分布式架构-教育项目

## 技术选型
- Web层：SpringMVC接收请求，进行视图跳转
- Service层：Spring进行IOC、AOP、及事务管理
- dao层：Mybatis进行数据库交互
- EasyCode插件：IDEA快速生成实体类的插件
- Zookeeper：服务注册与服务发现
- Dubbo：分布式框架，远程RPC调用
- Redis：内存数据库，缓存
- Lombok：消除实体类中冗余的get和set
- SpringSocial：SpringSocial(Spring社交)，简单理解就是和第三方应用打交道，微信登录用

## 开发环境
- 开发工具：后端->IDEA、数据库->Navicat Premium
- 开发环境：JDK11、Maven 3.6.3、MySQL 5.7、Zookeeper 3.6.0、Dubbo 2.5.7、Redis 5.0.4

## 项目说明

### edu-parent 服务提供者

### edu-web 服务消费者
