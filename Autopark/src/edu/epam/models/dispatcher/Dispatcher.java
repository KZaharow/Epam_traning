package edu.epam.models.dispatcher;

import edu.epam.models.order.Order;

import java.util.Objects;

/**
 * @author konstantin Zaharov
 * The {@code Dispatcher} class uses for define dispacher behaviour
 * Ussually dispatcher open (create), correct and cancel order, but
 * he can't to close order (means finish order), due this option
 * is a privilege of driver (Driver has closeOrder method)
 */

public class Dispatcher implements IDispatcher {

    //Dispatcher id value
    private int dispatcherId;
    //Dispatcher dispatcherName
    private String dispatcherName;

    public Dispatcher(int dispatcherId, String dispatcherName) {
        this.dispatcherId = dispatcherId;
        this.dispatcherName = dispatcherName;
    }

    /**
     * Methods implements ...
     * need to send
     * openOrder(Order order, Status status, Car car, Comment coment)
     */

    @Override
    public void openOrder(Order order) {

    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void correctOrder() {

    }

    @Override
    public void setTextComment() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dispatcher that = (Dispatcher) o;
        return dispatcherId == that.dispatcherId &&
                Objects.equals(dispatcherName, that.dispatcherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dispatcherId, dispatcherName);
    }
}
