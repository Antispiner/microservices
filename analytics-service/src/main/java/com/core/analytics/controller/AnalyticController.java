package com.core.analytics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticController {
    @RequestMapping(path = "/demo", method = RequestMethod.GET)
    public String test() {
        return "TEST_ACCOUNT";
    }
}
