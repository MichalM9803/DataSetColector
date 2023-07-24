package com.mmencfel.dataSetColector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/sentenceSet")
    public String sentenceSet(){return "index2";}

    @GetMapping("/mainPage")
    public String mainPage(){return "index";}
}
