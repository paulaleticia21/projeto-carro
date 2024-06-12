package com.portal.api.message;

import com.portal.api.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerMassage {

    @Autowired
    private KafkaTemplate<String, CarPostDTO> KafkaTemplate;

    private final String KAFKA_TOPIC = "car-post-topic";

    public void sendMassage(CarPostDTO carPostDTO){
        KafkaTemplate.send(KAFKA_TOPIC, carPostDTO);

    }

}
