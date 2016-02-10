package com.hyulib.login.domain;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sklee on 2016. 1. 17..
 */
public class LoginInfoRowMapper implements RowMapper<LoginInfo> {
    @Override
    public LoginInfo mapRow(ResultSet rs, int rowNum) throws SQLException{
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setCode(rs.getString("code"));
        loginInfo.setMessage(rs.getString("message"));
        loginInfo.setUserId(rs.getString("user_id"));
        loginInfo.setUserName(rs.getString("user_name"));
        loginInfo.setUserPosition(rs.getString("user_position"));
        loginInfo.setCampus(rs.getString("campus"));
        loginInfo.setCompany(rs.getString("company"));
        loginInfo.setDepartment(rs.getString("department"));
        loginInfo.setStatus(rs.getString("status"));
        loginInfo.setLoanCheck(rs.getString("loan_check"));
        loginInfo.setLoanCheckCause(rs.getString("loan_check_cause"));
        return loginInfo;
    }
}


