package kr.or.connect.todolist.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DBConfig.class})
@ComponentScan(basePackages= {"kr.or.connect.todolist.service","kr.or.connect.todolist.dao"})
public class ApplicationConfig {}
