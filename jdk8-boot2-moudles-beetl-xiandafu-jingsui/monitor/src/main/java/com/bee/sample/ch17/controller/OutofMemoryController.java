package com.bee.sample.ch17.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OutofMemoryController {
    Log log = LogFactory.getLog(this.getClass());
    List<String> list = Collections.synchronizedList(new ArrayList<String>());

    @Autowired
    DataSource ds;

    @RequestMapping("/all.html")
    public @ResponseBody
    String create() {
        addData();
        return "success " + list.size();
    }

    private void addData() {
        log.debug("add data,now is " + list.size());
        for (int i = 0; i < 300; i++) {
            String s = "abcd" + System.currentTimeMillis();
            list.add(s);
        }

    }

    @RequestMapping("/borrow.html")
    public @ResponseBody
    String borrow() {
        try {
            ds.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "ok";
    }


}
