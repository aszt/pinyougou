# 品优购
基于SOA架构一个综合性的B2B2C平台

### 一、品优购简介

品优购网上商城是一个综合性的 B2B2C 平台，类似京东商城、天猫商城。网站采用商家入驻的模式，商家入驻平台提交申请，有平台进行资质审核，审核通过后，商家拥有独立的管理后台录入商品信息。商品经过平台审核后即可发布。

品优购网上商城主要分为网站前台、运营商后台、商家管理后台三个子系统

### 二、框架组合

品优购采用当前流行的前后端编程架构。

后端框架采用Spring +SpringMVC+mybatis +Dubbo（Dubbox） 。前端采用angularJS + Bootstrap。

### 三、涉及技术

注册中心：Zookeeper

安全框架：SpringSecurity

分布式文件服务器：FastDFS

缓存：Redis

检索：sorl

消息中间件：JMS

短信解决方案：SpringBoot

网页静态化：Freemarker

支付：微信扫码支付


### 四、项目部署
- 集群解决方案
  RedisCluster
  SolrCloud
  Zookeeper 集群
  
 - MyCat & Nginx
  Nginx 静态网站部署
  Nginx 反向代理与负载均衡
  MyCat 数据库中间件
  
 - 容器部署解决方案 Docker
  
