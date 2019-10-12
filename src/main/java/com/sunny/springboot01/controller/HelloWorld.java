package com.sunny.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-10-3 15:18
 * @Version 1.0
 **/
@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("code","success");
        map.put("name", Arrays.asList("aaa","bbb","ccc"));
        return "success";
    }
}
