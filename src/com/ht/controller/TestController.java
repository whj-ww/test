package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/11/29.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value="/emp",method = RequestMethod.PUT)
    public String upd(){
        System.out.println("put进来了...");
        return "hello";
    }
    @RequestMapping(value="/emp",method = RequestMethod.GET)
    public String list(){
        System.out.println("get进来了...");
        return "hello";
    }
}
