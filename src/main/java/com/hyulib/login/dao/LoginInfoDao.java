package com.hyulib.login.dao;

import com.hyulib.login.domain.LoginInfo;
import com.hyulib.login.domain.LoginInfoRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

/**
 * Created by sklee on 2016. 1. 17..
 */
@Repository
public class LoginInfoDao {
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public LoginInfo getAuthenticatedUserData(String userId, String encodedPassword){

// postgresql
        String query ="select case when password = :password then '200' "+
        "else '300' end as code, " +
        "case when password = :password then '정상로그인' "+
        "else '비밀번호가 틀립니다' end as message, "+
        "        user_id,user_name,user_position, campus,company,department,status,loan_check,loan_check_cause "+
        "from st_user "+
        "where user_id=:user_id ";

// oracle
//        String query = "select case when password = :password then '200' " +
//                "            else '300' end as code, " +
//                "       case when password = :password then '정상로그인' " +
//                "            else '비밀번호가 틀립니다' end as message, " +
//                "   user_id, user_name " +
//                "  , (select name from ST_CODE where code_div='l13'and lang='kor' and code = s.USER_POSITION ) user_position " +
//                "  , decode (campus_div, 'H','서울','Y','ERICA') campus " +
//                "  , (select name from st_dept where lang='kor' and company_code = s.company_code and dept_code='00000000' ) company " +
//                "  , (select name from st_dept where lang='kor' and company_code = s.company_code and dept_code= s.dept_code and major_code='00000000' ) department " +
//                "  , (select name from ST_CODE where code_div='l19'and lang='kor' and code = s.STATUS_CODE ) status " +
//                "  , (select name from ST_CODE where code_div='l30'and lang='kor' and code = s.LOAN_CHECK ) loan_check " +
//                "  , (select name from ST_CODE where code_div='l20'and lang='kor' and code = s.LOAN_CHECK_CAUSE ) loan_check_cause " +
//                "from st_user s " +
//                "where user_id=:user_id  ";
        SqlParameterSource param = new MapSqlParameterSource().addValue("user_id", userId).addValue("password",encodedPassword);


        Object o = namedParameterJdbcTemplate.queryForObject(query,param, new LoginInfoRowMapper());

        return (LoginInfo)o;
    }
}
