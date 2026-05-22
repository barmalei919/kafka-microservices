package barmalei919.warehouse_service;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {
}
