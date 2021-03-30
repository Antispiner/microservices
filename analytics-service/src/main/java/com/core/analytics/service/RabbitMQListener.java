package com.core.analytics.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener implements MessageListener {

    @Autowired
    IAnalyticService analyticService;

    public void onMessage(Message message) {
        System.out.println("Consuming Message - " + new String(message.getBody()));
        analyticService.processMessage(new String(message.getBody()));
    }

}
