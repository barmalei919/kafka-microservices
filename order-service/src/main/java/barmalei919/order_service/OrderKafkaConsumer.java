package barmalei919.order_service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderKafkaConsumer {

    private final ObjectMapper objectMapper;

    @KafkaListener(topics = "orders", groupId = "order-service-group")
    public void consume(String message) {
        try {
            Order order = objectMapper.readValue(message, Order.class);
            log.info("Order received from Kafka: id={}", order.orderId());
            // дальнейшая обработка заказа
        } catch (Exception e) {
            log.error("Failed to deserialize order: {}", message, e);
        }
    }
}