package org.lessons.ch5_scope_and_lifecycle_of_bean.prototype_scope.by_bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public CommentService commentService() {
        return new CommentService();
    }
}
