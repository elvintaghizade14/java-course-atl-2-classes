package az.atlacademy.module01.lesson17;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Order<T> {

    private final T orderId;
    private final LocalDateTime orderDate;

    public Order(T orderId) {
        this.orderId = orderId;
        this.orderDate = LocalDateTime.now();
    }


    public T getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order<?> order = (Order<?>) o;
        return Objects.equals(orderId, order.orderId) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderDate);
    }

    @Override
    public String toString() {
        return String.format("{orderId=%s, orderDate=%s}", orderId, orderDate);
    }

}
