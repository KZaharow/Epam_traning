package edu.epam.models.order;

import edu.epam.models.car.Car;
import edu.epam.models.common.Route;

import java.util.*;

/**
 * @author konstantin Zaharov
 * The {@code Order} class includes general fields and methods which uses for add data about open,
 * cancel, close or order correction.
 * Dispatcher create object Order order.
 * Dispatcher sellect car, drivers, route to the current order and
 * comment this order if it need
 *
 * Note, dispatcher can't close order, it can driver only if order finished ok (due task)
 */
public class Order {

    //order number for db table 'orders.order_id
    private int orderId;
    //orderStatus is value for db table 'orders_status.order_id
    private OrderStatusEnum orderStatus;

    //orderdateTimeOpen, orderdateTimeClose are open/close date/time values for db table 'orders.opened/closed'
    // may be need type DateTime but I am not sure
    private String orderdateTimeOpen;
    private String orderdateTimeClose;

    //car is a unical id of sellected car for this order
    private Car car;

    //routeId is a id of sellected route
    private Route routeId;

    //dispatcher text comment if it need for for table 'orders', for example 'too slow' or s'hipment was broken' etc
    private String comment;


    public Order() {
    }

    public Order(int orderId, OrderStatusEnum orderStatus, String orderdateTimeOpen, String orderdateTimeClose, Car car, Route routeId, String comment) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.orderdateTimeOpen = orderdateTimeOpen;
        this.orderdateTimeClose = orderdateTimeClose;
        this.car = car;
        this.routeId = routeId;
        this.comment = comment;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderdateTimeOpen() {
        return orderdateTimeOpen;
    }

    public void setOrderdateTimeOpen(String orderdateTimeOpen) {
        this.orderdateTimeOpen = orderdateTimeOpen;
    }

    public String getOrderdateTimeClose() {
        return orderdateTimeClose;
    }

    public void setOrderdateTimeClose(String orderdateTimeClose) {
        this.orderdateTimeClose = orderdateTimeClose;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Route getRouteId() {
        return routeId;
    }

    public void setRouteId(Route routeId) {
        this.routeId = routeId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId &&
                orderStatus == order.orderStatus &&
                Objects.equals(orderdateTimeOpen, order.orderdateTimeOpen) &&
                Objects.equals(orderdateTimeClose, order.orderdateTimeClose) &&
                Objects.equals(car, order.car) &&
                Objects.equals(routeId, order.routeId) &&
                Objects.equals(comment, order.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderStatus, orderdateTimeOpen, orderdateTimeClose, car, routeId, comment);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderStatus=" + orderStatus +
                ", orderdateTimeOpen='" + orderdateTimeOpen + '\'' +
                ", orderdateTimeClose='" + orderdateTimeClose + '\'' +
                ", car=" + car +
                ", routeId=" + routeId +
                ", comment='" + comment + '\'' +
                '}';
    }
}
