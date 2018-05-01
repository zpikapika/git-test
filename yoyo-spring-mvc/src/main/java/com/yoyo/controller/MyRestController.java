package com.yoyo.controller;

import com.yoyo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by acer on 2017/7/4.
 */
@RestController
public class MyRestController {

    @Autowired
    private TestService testService;
    @RequestMapping(value = "/rest",produces = "text/plain;charset=UTF-8")
    public String testRest(){
        return testService.toTestName();
    }
}
