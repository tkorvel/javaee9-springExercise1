package com.sda.javaee9springex1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class FirstController {

    @GetMapping("/my-first-page")
    public String firstPage() {
        log.info("firstPage() method called!!!");
        // looking for html page inside resources/templates
        return "home-page";
    }
}
