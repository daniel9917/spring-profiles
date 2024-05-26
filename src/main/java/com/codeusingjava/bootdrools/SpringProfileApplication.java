package com.codeusingjava.bootdrools;

import com.codeusingjava.bootdrools.cloud.CloudMessagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
//@ComponentScan(basePackages = {
public class SpringProfileApplication {
    public static void displayAllBeans() {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }
    }
    private static ApplicationContext applicationContext;

    public static void main (String [] args) {
        applicationContext = SpringApplication.run(SpringProfileApplication.class);
//        displayAllBeans();
    }
}
