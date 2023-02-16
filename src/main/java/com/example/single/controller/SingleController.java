package com.example.single.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SingleController {

    @GetMapping(value = "/test")
    public String test(@RequestParam("a") int a,
                       @RequestParam("b") int b) {
        log.debug("com.example.single.controller.SingleController.test.a: {}", a);
        log.debug("com.example.single.controller.SingleController.test.b: {}", b);

        return String.valueOf(a + b);
    }
}
