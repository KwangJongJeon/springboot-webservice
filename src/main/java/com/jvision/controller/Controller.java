package com.jvision.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @RequestMapping("/")
    public String index() {
        return "안녕하세요!";
    }

}
