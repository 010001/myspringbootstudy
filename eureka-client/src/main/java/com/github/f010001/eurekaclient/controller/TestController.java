package com.github.f010001.eurekaclient.controller;

import java.util.List;
import javax.servlet.Registration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther fangbin
 * @date 19-1-7
 */
@RestController
@RequestMapping(value="/test")
public class TestController {

    /**
     * 日志记录器
     */
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DiscoveryClient client;


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    String getHello(){
        /*List<ServiceInstance> list = client.getInstances(registration.getName());
        ServiceInstance instance = null;
        if (list != null && list.size() > 0) {
            for(ServiceInstance itm : list){
                if(itm.getPort() == 2001)
                    instance = itm;
            }
        }

        logger.info("/hello : " + instance.getHost() + " ， service_id: " + instance.getServiceId());*/

        client.getServices().stream().forEach(serviceame -> {
            System.out.println("AAAAAAAA--------" + client.getInstances(serviceName).get(0).getHost());
        });
        return "Hello";
    }

}
