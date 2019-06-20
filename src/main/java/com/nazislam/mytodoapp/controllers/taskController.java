package com.nazislam.mytodoapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class taskController {

    @GetMapping(value = "/getTodos")
    public List<String> getTodos() {
        return Arrays.asList("a", "b");
    }

}
