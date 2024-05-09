package com.dh.catalogservice.queue;

import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;
import com.dh.catalogservice.service.impl.CatalogServiceImpl;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class CatalogListener {
    private final CatalogServiceImpl service;
    public CatalogListener(CatalogServiceImpl service){
        this.service = service;
    }
    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }
    @RabbitListener(queues = "QueueMovie")
    public void receive(@Payload Movie movie){
        service.saveMovie(movie);
    }
    @RabbitListener(queues = "QueueSerie")
    public void receive(@Payload Serie serie){
        service.create(serie);
    }
}
