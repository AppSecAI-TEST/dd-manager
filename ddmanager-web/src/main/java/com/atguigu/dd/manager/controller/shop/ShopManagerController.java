package com.atguigu.dd.manager.controller.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopManagerController {

    @RequestMapping("/shopList.html")
    public String shopList() {
        return "shopList";
    }

    @RequestMapping("/shopDetails.html")
    public String shopDetails() {
        return "shopDetails";
    }

    @RequestMapping("/shopUpdataDetails.html")
    public String shopUpdataDetails() {
        return "shopUpdataDetails";
    }

    @RequestMapping("/shopAddDetails.html")
    public String shopAddDetails() {
        return "shopAddDetails";
    }
    
    @RequestMapping("/shopAddStore.html")
    public String shopAddStore() {
        return "shopAddStore";
    }
}

