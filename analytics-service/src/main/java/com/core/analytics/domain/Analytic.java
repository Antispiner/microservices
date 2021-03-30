package com.core.analytics.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity()
@Table(name="Analytic")
@Data
public class Analytic implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="sessionkey")
    private String sessionkey;

    @Column(name="userId")
    private String userId;

    @Column(name="service")
    private String service;

    @Temporal(TemporalType.DATE)
    private Date startTime;

    @Temporal(TemporalType.DATE)
    private Date endTime;

    @Column(name="request")
    private String request;

    @Column(name="response")
    private String response;

    @Column(name="ip")
    private String ip;
}
