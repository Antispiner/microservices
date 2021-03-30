package com.core.analytics.config;

import com.core.analytics.service.RabbitMQListener;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Value("${analytics.rabbitmq.queue}")
    String queueName;

    @Value("${analytics.rabbitmq.username}")
    String username;

    @Value("${analytics.rabbitmq.password}")
    private String password;

    @Value("${analytics.rabbitmq.url}")
    private String url;

    @Bean
    Queue queue() {
        return new Queue(queueName, false);
    }

    @Bean
    public MessageConverter jsonMessageConverter(){
        return new Jackson2JsonMessageConverter();
    }


    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setAddresses(url);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        return connectionFactory;
    }

    @Bean
    MessageListenerContainer messageListenerContainer() {
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setConnectionFactory(connectionFactory());
        simpleMessageListenerContainer.setQueues(queue());
        simpleMessageListenerContainer.setMessageConverter(jsonMessageConverter());
        simpleMessageListenerContainer.setMessageListener(new RabbitMQListener());
        return simpleMessageListenerContainer;

    }
}
