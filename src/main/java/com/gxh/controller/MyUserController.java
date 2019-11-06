package com.gxh.controller;

import com.gxh.pojo.MyUser;

import com.gxh.mapper.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MyUserController {
    @Autowired
    private MyUserMapper myUserMapper;

    @RequestMapping("/myuser/getUserList")
    @ResponseBody
    public List<MyUser> getUserList(){
       return myUserMapper.getUserList();
    }
}
