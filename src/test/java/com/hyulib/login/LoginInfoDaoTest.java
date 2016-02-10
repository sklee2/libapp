package com.hyulib.login;

import com.hyulib.LibappApplication;
import com.hyulib.login.dao.LoginInfoDao;
import com.hyulib.login.etclogin.EtcLoginCheck;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by sklee on 2016. 1. 11..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LibappApplication.class)
public class LoginInfoDaoTest {
    @Autowired
    LoginInfoDao loginInfoDao;

    @Test
    public void loginInfoTest() throws Exception {
        String userId="000A011982";
        String password = "1200";
        EtcLoginCheck etcLoginCheck = new EtcLoginCheck();
        try {
            System.out.println(loginInfoDao.getAuthenticatedUserData(userId, etcLoginCheck.passwordEncode(password)));
        }catch(EmptyResultDataAccessException e){
            System.out.println("login error!!!");
        }
    }
}
