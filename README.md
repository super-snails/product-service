## product-service

- 一、项目目录结构
- 二、后端技术
- 三、描述

### 一、项目目录结构

```
product-servie
├── api -- 核心业务层
├── config -- 配置类
├── init -- 项目启动加载自定义数据
├── utils -- 工具类
└── todo
```

### 二、后端技术

|  技术   | 说明  | 官网  |
|  ----  | ---- | ----  |
| SpringBoot  | 基础框架 | https://spring.io/projects/spring-boot |
| MyBatis-Plus  | 数据操作层 | https://baomidou.com/ |
| Lombok | 简化代码库 | https://projectlombok.org/ |
| Dubbo | 服务管理者 | https://dubbo.apache.org/zh/ |
| Nacos | 注册中心 |  https://nacos.io/en-us/ |
| Hutool | Java工具类库 |  https://www.hutool.cn/docs/#/ |
| Logback | 日志 |  https://logback.qos.ch/manual/index.html |


### 三、描述

- 服务提供者不处理任何异常信息，所有的异常信息都有服务的消费者来处理，然后返回给前端。
