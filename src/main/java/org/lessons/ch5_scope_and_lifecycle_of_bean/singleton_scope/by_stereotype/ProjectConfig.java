package org.lessons.ch5_scope_and_lifecycle_of_bean.singleton_scope.by_stereotype;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.lessons.ch5_scope_and_lifecycle_of_bean.singleton_scope.by_stereotype")
public class ProjectConfig {

}
