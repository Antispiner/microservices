package com.core.gateway;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Timed(value = "greeting.time", description = "Time taken to return greeting")
    @RequestMapping(path = "/demo", method = RequestMethod.GET)
    public String test() {
        return "TEST_ACCOUNT";
    }
}
