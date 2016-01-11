package com.hyulib.hyreader.domain;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sklee on 2016. 1. 6..
 */
public class HyreaderAttendRowMapper implements RowMapper<HyreaderAttend> {
    @Override
    public HyreaderAttend mapRow(ResultSet rs, int rowNum) throws SQLException{
        HyreaderAttend hyreaderAttend = new HyreaderAttend();
        hyreaderAttend.setCategory(rs.getString("category"));
        hyreaderAttend.setEvent_name(rs.getString("event_name"));
        hyreaderAttend.setPoint(rs.getInt("point"));
        hyreaderAttend.setPoint_type(rs.getString("point_type"));
        hyreaderAttend.setTerm(rs.getString("term"));
        hyreaderAttend.setUser_id(rs.getString("user_id"));
        hyreaderAttend.setYear(rs.getString("year"));
        return hyreaderAttend;

    }

}
