package com.demo.controller;

import com.demo.dao.entity.UserEntity;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/select")
    public String select(Model model){
        UserEntity user = userService.getUserById(2);
        model.addAttribute("user",user);
        return "select";
    }
}
