package com.ccit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

        @RequestMapping("test")
        @ResponseBody
        public  String toTest(){
            return  "success";
        }

    @RequestMapping("toTry")
    @ResponseBody
    public  String toTry(){
        return  "你好呀";
    }
}
