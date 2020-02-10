package com.jenkins.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mirko
 * @Description
 * @createTime 2020年02月10日 23:24:00
 */
@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/getDefault")
    public Map<String,String> getDefaultValue(){
        Map<String, String> map = new HashMap<>();
        map.put("服务名称", appName);
        map.put("端口", port);
        return map;
    }

}
