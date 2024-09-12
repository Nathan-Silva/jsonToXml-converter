package br.com.jsontoxml.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.adapter.ConsumerRecordMetadata;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PayloadConsumer {

    private final Logger LOGGER = LoggerFactory.getLogger(PayloadConsumer.class);

    @KafkaListener(
            id = "${kafka.consumer.payload.id}",
            topics = "${kafka.consumer.payload.topics}",
            containerFactory = "kafkaListenerFactory",
            groupId = "${kafka.consumer.payload.group-id}"
    )
    public void onMessage(@Payload String message, ConsumerRecordMetadata consumerRecordMetadata) {
        LOGGER.info("Message -> {}", message);
    }
}
