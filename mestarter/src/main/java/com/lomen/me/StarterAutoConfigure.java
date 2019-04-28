package com.lomen.me;

import com.lomen.me.config.HelloServiceProperties;
import com.lomen.me.config.StarterServiceProperties;
import com.lomen.me.service.HelloService;
import com.lomen.me.service.StarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({StarterService.class,HelloService.class})
@EnableConfigurationProperties({StarterServiceProperties.class,HelloServiceProperties.class})
public class StarterAutoConfigure {

    @Autowired
    private StarterServiceProperties properties;

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "lomen.service", value = "enabled",matchIfMissing=true)
    StarterService starterService (){
        return new StarterService(properties.getConfig());
    }

    @Bean
    @ConditionalOnProperty(prefix="me",value="enabled",matchIfMissing=true)
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }

}