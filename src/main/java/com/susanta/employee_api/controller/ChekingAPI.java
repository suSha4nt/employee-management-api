package com.susanta.employee_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChekingAPI {

    @GetMapping("/home")
    public String CheckHello() {
        return "API Working";
    }
}
