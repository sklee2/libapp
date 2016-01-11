package com.hyulib.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sklee on 2016. 1. 2..
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
