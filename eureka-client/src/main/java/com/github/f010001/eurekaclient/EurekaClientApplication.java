package com.github.f010001.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 注解@EnableDiscoveryClient，@EnableEurekaClient的区别
 *
 * <p>SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。
 *
 * <p>1，@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现；
 * 2，@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；
 *
 * <p>如果你的classpath中添加了eureka，则它们的作用是一样的。 --------------------- 作者：诸葛_瓜皮 来源：CSDN
 * 原文：https://blog.csdn.net/ezreal_king/article/details/72594535 版权声明：本文为博主原创文章，转载请附上博文链接！
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
