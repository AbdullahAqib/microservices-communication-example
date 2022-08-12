package com.itachay.consumer.service.impl;

import com.itachay.consumer.config.AMQPConfig;
import com.itachay.consumer.service.ConsumerService;
import com.itachay.consumer.service.dto.UserDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @RabbitListener(queues = AMQPConfig.QUEUE)
    public void consumeUserInformation(UserDTO userDTO) {
        System.out.println("Consumed User information: " + userDTO);
    }
}
