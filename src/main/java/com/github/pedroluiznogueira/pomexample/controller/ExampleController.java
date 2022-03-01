package com.github.pedroluiznogueira.pomexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    private Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @GetMapping
    public String example() {
        logger.info("check log");
        return "example working fine";
    }
}
