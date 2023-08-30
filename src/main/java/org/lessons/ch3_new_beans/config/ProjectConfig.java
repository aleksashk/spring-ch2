package org.lessons.ch3_new_beans.config;

import org.lessons.ch3_new_beans.beans.Parrot;
import org.lessons.ch3_new_beans.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.lessons.ch3_new_beans.beans")
public class ProjectConfig {


}
