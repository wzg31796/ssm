package com.wzg.controller;


import com.wzg.pojo.User;
import com.wzg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {




    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping("login")
    public String login(){
        System.out.println("I be commit");
        return "wzg";


    }

    @ResponseBody
    @RequestMapping("/user/{userid}")
    public User getUserById(@PathVariable Integer userid)
    {
        System.out.println("user be commit");
        User user=userService.getUserById(userid);
        System.out.println("success be get");

        System.out.println(user.getUsername());

        return user;
    }
}
