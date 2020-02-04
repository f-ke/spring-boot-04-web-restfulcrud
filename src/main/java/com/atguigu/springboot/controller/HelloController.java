package com.atguigu.springboot.controller;

import com.atguigu.springboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
    return "hello world";
    }
    @RequestMapping("/index.html")
    public String index(){
        return("/login");
   }
    @RequestMapping("/test")
    public String test(Map<String,Object> map){
        map.put("test", "hello");
        map.put("test2", "lADY");
        map.put("user", Arrays.asList("zhangsan","lisi"));
        return "/test";
    }
}
