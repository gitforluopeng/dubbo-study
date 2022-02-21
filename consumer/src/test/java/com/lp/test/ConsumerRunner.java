package com.lp.test;

import com.lp.service.HelloService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerRunner {

    @Test
    public void m2() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService");
        String str = helloService.sayHello("Lily");
        System.out.println(str);
        System.in.read();
    }

}
