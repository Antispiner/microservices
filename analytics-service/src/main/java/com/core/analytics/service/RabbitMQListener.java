package com.core.analytics.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQListener implements MessageListener {

    final
    IAnalyticService analyticService;

    public RabbitMQListener(IAnalyticService analyticService) {
        this.analyticService = analyticService;
    }

    public void onMessage(Message message) {
        try {
            System.out.println("Consuming Message - " + new String(message.getBody()));
            analyticService.processMessage(new String(message.getBody()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
