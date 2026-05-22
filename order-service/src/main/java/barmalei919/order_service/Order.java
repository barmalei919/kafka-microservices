package barmalei919.order_service;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {
}
