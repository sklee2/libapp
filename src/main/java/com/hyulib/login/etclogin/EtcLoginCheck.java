package com.hyulib.login.etclogin;

import KISA.SHA256;
import org.apache.commons.codec.binary.Base64;

/**
 * Created by sklee on 2016. 1. 11..
 */

public class EtcLoginCheck {


    public Boolean loginCheck(String userId, String password) {
        Boolean passwordEqual = new Boolean(false);
        String encodePassword = passwordEncode(password);
//        String resultUserId=passwordCompareDao.passwordCompare(userId, encodePassword);
        return passwordEqual;

    }
    public String passwordEncode(String password){

        SHA256 sha256 = new SHA256(password.getBytes());
        return new String(Base64.encodeBase64(sha256.GetHashCode()));

    }

}
