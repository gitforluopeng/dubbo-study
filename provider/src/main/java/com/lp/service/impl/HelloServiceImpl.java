package com.lp.service.impl;

import com.lp.service.HelloService;

public class HelloServiceImpl implements HelloService {

    public String sayHello(String who) {
        return "Hi~," + who + ".";
    }

}
