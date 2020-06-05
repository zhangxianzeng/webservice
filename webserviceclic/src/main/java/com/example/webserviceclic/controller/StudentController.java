package com.example.webserviceclic.controller;

import net.sf.json.JSONArray;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/m")
public class StudentController {
   // JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
    @RequestMapping("/n")
    public String main2() throws Exception {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://127.0.0.1:8090/demo/StudentService1?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = new Object[0];

            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("getAll1");
            JSONArray jsonArray = JSONArray.fromObject(objects);
            System.out.println(Arrays.toString(jsonArray.toArray()));
            return Arrays.toString(jsonArray.toArray());


    }
}
