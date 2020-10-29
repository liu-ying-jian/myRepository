package com.ujiuye.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ujiuye.service.HelloService;
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "null";
    }
}
