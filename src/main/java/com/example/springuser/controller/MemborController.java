package com.example.springuser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemborController {
    @GetMapping("/member/save")
    public String saveForm(){
        return "save";
    }
}
