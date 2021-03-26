package com.core.analytics.client;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AnalyticServiceClient {
    @RequestMapping(method = RequestMethod.GET, value = "/test", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    String test();
}
