package com.atguigu.mvc.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Pecklim
 * @date 2021/10/20 - 0:40
 */
@Controller
public class TestController {
    @RequestMapping(value = "/")
    public String index(){
        return "/index";
    }


}
