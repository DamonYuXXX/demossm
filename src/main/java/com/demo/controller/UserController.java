package com.demo.controller;

import com.demo.dao.entity.UserEntity;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/select",method = RequestMethod.POST)
    public String select(Model model,int id){
        UserEntity user = userService.getUserById(id);
        System.out.println(id);
        model.addAttribute("user",user);
        return "select";
    }
}
