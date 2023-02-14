package com.codestates.todoapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoAppController {

    @GetMapping("/")
    public String todo(){
        return "To-do-Application !";
    }
}
