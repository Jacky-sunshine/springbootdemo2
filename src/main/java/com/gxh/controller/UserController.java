package com.gxh.controller;

import com.gxh.dao.UserDao;
import com.gxh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/user/getUserList")
    public String getUserList(Model model){
        List<User> userList = userDao.findAll();
        model.addAttribute("userList",userList);
        return "user";
    }
}
