package com.youzheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("res/{model}")
    public String doIndex(@PathVariable String model){
        return model;
    }
}
