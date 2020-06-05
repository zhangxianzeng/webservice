package com.example.webservice.service;

import java.util.Date;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String user) {
        return user+":hello"+"("+new Date()+")";
    }

    @Override
    public String saybay(String user) {
        return "再见";
    }
}
