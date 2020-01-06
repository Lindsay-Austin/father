package com.web;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")
public class WebTest {

    @Autowired
    private UserService userService;

    @RequestMapping("/showAll")
    public String showAll(){
        return userService.showService()+"    我是service！";
    }
}
