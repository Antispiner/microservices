package com.core.analytics.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AnalyticDto {
    private String sessionkey;
    private String userId;
    private String service;
    private Date startTime;
    private Date endTime;
    private String request;
    private String response;
    private String ip;
}
