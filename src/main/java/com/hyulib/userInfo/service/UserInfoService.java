package com.hyulib.userInfo.service;

import com.hyulib.userInfo.dao.UserInfoDao;
import com.hyulib.userInfo.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sklee on 2016. 2. 8..
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    public UserInfo getUserInfo(String userId){
        return userInfoDao.findOneByUserId(userId);
    }
}
