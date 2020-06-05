package com.example.webservice.service;

import javax.jws.WebService;

@WebService
public interface DemoService {
    public String sayHello(String user);
    public String saybay(String user);
}