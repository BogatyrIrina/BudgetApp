package me.bogatyr.budgetapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
   @GetMapping
    public String helloWord (){
        return "Hello, web!";
    }
}
