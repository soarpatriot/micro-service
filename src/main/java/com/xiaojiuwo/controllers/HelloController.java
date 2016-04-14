package com.xiaojiuwo.controllers;


import com.xiaojiuwo.services.StoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhaibao on 15/10/31.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    StoresService storesService;

    @RequestMapping(value={"","/"},method= RequestMethod.GET)
    @ResponseBody
    public String index(){
       return storesService.getParticipants("race");

    }

}
