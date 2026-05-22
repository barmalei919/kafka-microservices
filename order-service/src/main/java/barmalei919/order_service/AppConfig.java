package barmalei919.order_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class AppConfig {

    @Bean
    public AtomicInteger orderIdCounter() {
        return new AtomicInteger(0);
    }
}