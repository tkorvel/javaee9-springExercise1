package com.sda.javaee9springex1.controller;

import lombok.Data;
import lombok.Value;
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
        // Spring please use page: resources/templates/home-page.html
        return "home-page";
    }

    @GetMapping("/my-second-page")
    public String secondPage() {
        log.info("secondPage() method called!!!");
        //looking for html page inside resources/templates
        return "second-page";
    }

    @GetMapping("/third-page")
    public String thirdPage() {
        log.info("thirdPage() method was called!!!");
        return "pages/third-page";
    }
}
