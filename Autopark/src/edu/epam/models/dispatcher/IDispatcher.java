package edu.epam.models.dispatcher;

import edu.epam.models.order.Order;

/**
 * @author  konstantin Zaharov
 * IDispatcer define basic methods for class Dispatcher which will
 * use methods for basic order operations
 */
public interface IDispatcher {
    //void openOrder(Order order, Driver driver); ??
    void openOrder(Order order);
    //void closeOrder(); - this method implement driver only due task
    void cancelOrder();
    void correctOrder();
    void setTextComment();
}
