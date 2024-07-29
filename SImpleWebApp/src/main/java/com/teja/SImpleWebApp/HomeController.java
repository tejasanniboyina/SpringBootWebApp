package com.teja.SImpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
       return "Welcome  Home";
    }

    @RequestMapping("/about")
    public String about(){
        return "There is nothing to say bro!";
    }
}
