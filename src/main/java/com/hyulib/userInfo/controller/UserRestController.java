package com.hyulib.userInfo.controller;

import com.hyulib.userInfo.dao.UserInfoDao;
import com.hyulib.userInfo.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sklee on 2016. 2. 8..
 */
@RestController

public class UserRestController {
    @Autowired
    private UserInfoDao userInfoDao;

    @RequestMapping("userapi")
    public UserInfo getUserInfo(){
        return userInfoDao.findOneByUserId("000A011982");
    }

}
