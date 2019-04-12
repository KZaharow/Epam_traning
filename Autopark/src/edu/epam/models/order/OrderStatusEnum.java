package edu.epam.models.order;
/**
 * @author konstantin Zaharov
 * The {@code OrderStatusEnum} class includes variants of order status
 */

public enum OrderStatusEnum {
    OPENED,
    CLOSED,
    CANCELED_BY_CLIENT,
    CANCELED_BY_CAR_PROBLEM,
    CANCELED_DISPATCHER,
    CORRECTED
}
