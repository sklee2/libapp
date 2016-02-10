package com.hyulib.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 * Created by sklee on 2016. 1. 11..
 */
@Repository
public class PasswordCompareDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public String passwordCompare(String userId, String encodePassword){
        String query = "select user_id from st_user where user_id=:user_id and password=:password ";

        SqlParameterSource param = new MapSqlParameterSource().addValue("user_id", userId).addValue("password",encodePassword);


        Object o = namedParameterJdbcTemplate.queryForObject(query, param, String.class);
        return (String)o;

    }
}
