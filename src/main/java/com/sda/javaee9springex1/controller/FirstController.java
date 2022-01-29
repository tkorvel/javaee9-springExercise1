package com.sda.javaee9springex1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class FirstController {

    @GetMapping({"/main-page", "/"})
    public String mainPage() {
        log.info("mainPage() method called!!!");
        // looking for html page inside resources/templates
        // Spring please use page: resources/templates/home-page.html
        return "home-page";
    }

    @GetMapping("/personalParameters")
    public String personalParameters(@RequestParam(value = "name", defaultValue = "Tanel") String name,
                                     @RequestParam(value = "heightInCm", defaultValue = "180") String heightInCm,
                                     @RequestParam(value = "weightInKg", defaultValue = "80") String weightInKg,
                                     Model pageParameters) {


        log.info("personalParameters() method was called!!!");
        log.info("my name is: [{}]", name);
        log.info("my height in cm is: [{}]", heightInCm);
        log.info("my weight in kg is: [{}]", weightInKg);
        log.info(String.format("my name is: [%s] my height is: [%s] and my weight is: [%s]", name, heightInCm, weightInKg));

        pageParameters.addAttribute("name", name)
                .addAttribute("heightInCm", heightInCm)
                .addAttribute("weightInKg", weightInKg);

        return "dataInMetricSys";
    }

    @PostMapping("/my-first-post")
    public String myFirstOtherThanGetHttpMethod() {
        log.info("myFirstOtherThanHttpMethod() was called");
        return "pages/post-page";
    }
}
