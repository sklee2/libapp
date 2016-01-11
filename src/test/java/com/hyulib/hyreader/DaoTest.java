package com.hyulib.hyreader;

import com.hyulib.hyreader.dao.HyreaderDao;

import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by sklee on 2016. 1. 6..
 */
public class DaoTest {
    @Test
    public void getHyreaderAttendList(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        HyreaderDao hyreaderDao = ctx.getBean(HyreaderDao.class);

        hyreaderDao.hyreaderAttendList("2012021239");
        System.out.println(hyreaderDao);
    }

}
