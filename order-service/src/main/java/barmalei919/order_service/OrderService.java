package barmalei919.order_service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderKafkaProducer orderKafkaProducer;

    public void saveOrder(Order order) {
        //saving to db
        orderKafkaProducer.sendOrder(order);
        log.info("Order successfully saved: id={}", order.orderId());
    }
}