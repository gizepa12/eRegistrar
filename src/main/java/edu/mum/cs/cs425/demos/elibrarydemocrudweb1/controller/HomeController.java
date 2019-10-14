package edu.mum.cs.cs425.demos.elibrarydemocrudweb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/elibrary/home"})
    public String home() {
        return "home/index";
    }

}
