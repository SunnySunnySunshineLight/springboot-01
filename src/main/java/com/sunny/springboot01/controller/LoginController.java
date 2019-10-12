package com.sunny.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Description TODO
 * @Author sunny
 * @Date 2019-10-5 15:36
 * @Version 1.0
 **/
@Controller
public class LoginController {
    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, HttpSession session,
                        Map result){
        if(!StringUtils.isEmpty(password)&&"abc123".equals(password)
                &&!StringUtils.isEmpty(username)&&"admin".equals(username)){
            session.setAttribute("user","111");
            return "redirect:/main.html";
        }else{
            result.put("msg","用户名密码错误");
            return "/index.html";
        }
    }
}
