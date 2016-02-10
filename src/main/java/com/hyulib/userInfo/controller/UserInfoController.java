package com.hyulib.userInfo.controller;

import com.hyulib.userInfo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sklee on 2016. 1. 2..
 */
@Controller
@RequestMapping("/")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/")
    String index(){
        return "index";
    }
//    @RequestMapping("search/{item}")
//    public LoginInfo getLoginInfo(@PathVariable String item, @RequestParam(value="keyword") String keyword){
//
//    }
    @RequestMapping("st_user/{userId}")
    public String getLoginInfo(@PathVariable String userId, Model model){
        model.addAttribute("loginUserInfo",userInfoService.getUserInfo(userId));
        return "user/info";
    }
}
