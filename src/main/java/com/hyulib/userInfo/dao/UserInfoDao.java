package com.hyulib.userInfo.dao;

import com.hyulib.userInfo.domain.UserInfo;
import com.hyulib.userInfo.domain.UserInfoRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 * Created by sklee on 2016. 2. 8..
 */
@Repository
public class UserInfoDao {
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public UserInfo findOneByUserId(String userId){
        String query = "select user_id, user_name,user_position, company, department, status, loan_check " +
                "from st_user " +
                "where user_id = :user_id" ;
        SqlParameterSource param = new MapSqlParameterSource().addValue("user_id", userId);
        Object o = namedParameterJdbcTemplate.queryForObject(query,param, new UserInfoRowMapper());
        return (UserInfo)o;

    }

}
