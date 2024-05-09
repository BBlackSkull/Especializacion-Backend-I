package com.dh.movieservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class RabbitMQSenderConfig {
    @Value("QueueMovie")
    private String queue;
    @Bean
    public Queue queue(){
        return new Queue(this.queue, false);
    }
}