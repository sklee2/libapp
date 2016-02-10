package com.hyulib.hyreader.dao;

import com.hyulib.hyreader.domain.HyreaderAttend;
import com.hyulib.hyreader.domain.HyreaderAttendRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sklee on 2016. 1. 6..
 */
@Repository
public class HyreaderDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<HyreaderAttend> hyreaderAttendList(String userId){
        String query = "select e.year, e.term, e.category, e.event_name, a.user_id, a.point_type, a.point,a.ATTEND_NO,E.EVENT_NO " +
                "from hr_event e, HR_ATTEND a " +
                "where e.event_no = a.event_no " +
                "and a.user_id=:user_id " +
                "order by e.category,e.event_no";
        SqlParameterSource param = new MapSqlParameterSource().addValue("user_id", userId);
        return namedParameterJdbcTemplate.query(query,param, new HyreaderAttendRowMapper());

    }
}





