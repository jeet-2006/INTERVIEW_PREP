package com.springboot.tutorial.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/*
@RestController:
it hase to return some response body
*/
@RestController
public class Controller {
    @GetMapping("/")
    String namasteMahadev () {
        return "Har Har Mahadev";
    }
}
