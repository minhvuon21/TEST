package com.example.buoi1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class Admincontroller {

    @GetMapping("/uri1")
    @ResponseBody
    public String hehe() {
        return "hehe";
    }

    @GetMapping("/uri2")
    @ResponseBody
    public String hihi() {
        return "hihi";
    }
}
