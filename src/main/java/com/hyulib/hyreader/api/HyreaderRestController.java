package com.hyulib.hyreader.api;

import com.hyulib.hyreader.dao.HyreaderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sklee on 2016. 1. 9..
 */
@RestController
public class HyreaderRestController {

    @Autowired
    private HyreaderDao hyreaderDao;

    @RequestMapping("api")
    public List getHyreaderAttendList(){
        return hyreaderDao.hyreaderAttendList("2012021239");
    }



}
