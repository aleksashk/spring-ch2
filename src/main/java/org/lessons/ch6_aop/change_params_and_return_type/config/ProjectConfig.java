package org.lessons.ch6_aop.change_params_and_return_type.config;

import org.lessons.ch6_aop.change_params_and_return_type.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.lessons.ch6_aop.change_params_and_return_type")
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public LoggingAspect aspect(){
        return new LoggingAspect();
    }

}
