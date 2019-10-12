package com.sunny.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-10-12 16:01
 * @Version 1.0
 **/
@Controller
public class ListController {
    @RequestMapping("/list")
    public String list(){
        return "list";
    }
}
