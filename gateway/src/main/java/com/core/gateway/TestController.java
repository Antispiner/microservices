package com.core.gateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(path = "/demo", method = RequestMethod.GET)
    public String test() {
        return "TEST_ACCOUNT";
    }

}
