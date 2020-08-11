package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("/save")
    public void sava(){
        System.out.println(222);
        System.out.println(222);
        System.out.println(222);
        System.out.println(11111);
        System.out.println(11111);
        System.out.println(11111);

    }
}
