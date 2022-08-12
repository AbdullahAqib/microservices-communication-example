package com.itachay.producer.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itachay.producer.config.AMQPConfig;
import com.itachay.producer.service.ProducerService;
import com.itachay.producer.service.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerServiceImpl implements ProducerService {

    private static final ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

    private final RabbitTemplate rabbitTemplate;

    public void publishUserInformation(UserDTO userDTO) {
        rabbitTemplate.convertAndSend(AMQPConfig.EXCHANGE, AMQPConfig.ROUTING_KEY, userDTO);
    }

}
