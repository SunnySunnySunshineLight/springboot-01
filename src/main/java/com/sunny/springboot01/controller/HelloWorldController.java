package com.sunny.springboot01.controller;

import com.sunny.springboot01.entity.MessageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-9-4 17:01
 * @Version 1.0
 **/
@RestController
public class HelloWorldController {
    @Autowired
    MessageVO vo;
    @RequestMapping("/1hello")
    public Object hello(){
        return vo;
    }
}
