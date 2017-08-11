package com.atguigu.dd.manager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "id", defaultValue = "2") Integer id, Model model) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("key01", "val01...");
        map.put("key02", "val02...");
        System.out.println(map);

        return "forward:/success.jsp";
    }
    
    @RequestMapping("/shop.html")
    public String forwardOrderPage(){
        return "shop";
    }
    
    //进入超管后台主页
    @RequestMapping("/manager")
    public String forwardManagerPage(){
        return "manager";
    }

}
