package com.hyulib.hyreader.domain;

import java.util.Date;

/**
 * Created by sklee on 2016. 1. 6..
 */
public class HyreaderAttend {
    private String year;
    private String term;
    private String category;
    private String event_name;
    private String user_id;
    private String point_type;
    private Integer point;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPoint_type() {
        return point_type;
    }

    public void setPoint_type(String point_type) {
        this.point_type = point_type;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }
}
