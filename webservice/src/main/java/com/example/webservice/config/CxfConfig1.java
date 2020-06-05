package com.example.webservice.config;
import com.example.webservice.service.*;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


@Configuration
public class CxfConfig1 {

    @Bean
    public ServletRegistrationBean createServletRegistrationBean() {
        return new ServletRegistrationBean(new CXFServlet(),"/demo/*");
    }
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }
    @Bean
    public DemoService demoService() {
        return new DemoServiceImpl();
    }
    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl();
    }
    @Bean
    public StudentService1 studentService1() {
        return new StudentServiceImpl1();
    }
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), demoService());
        endpoint.publish("/api");
        return endpoint;
    }
    @Bean
    public Endpoint endpointStudentService() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), studentService());
        //接口发布在 /StudentService下
        endpoint.publish("/StudentService");
        return endpoint;
    }
    @Bean
    public Endpoint endpointStudentService1() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), studentService1());
        //接口发布在 /StudentService下
        endpoint.publish("/StudentService1");
        return endpoint;
    }
    @Bean
    public Endpoint endpointUserService() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userService());
        endpoint.publish("/UserService");
        return endpoint;
    }
}