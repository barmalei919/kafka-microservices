package barmalei919.order_service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderKafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    public void sendOrder(Order order) {
        try {
            String json = objectMapper.writeValueAsString(order);
            kafkaTemplate.send("orders", order.orderId(), json);
            log.info("Order sent to Kafka: id={}", order.orderId());
        } catch (Exception e) {
            throw new RuntimeException("Failed to send order to Kafka", e);
        }
    }
}