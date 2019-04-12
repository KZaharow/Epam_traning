package edu.epam.models.car;

/**
 * @author konstantin Zaharov
 * The {@code ICar} inteface uses by Driver for set up car status.
 * This status can be read by Dispatcher before order opening
 */

public interface ICar {
    void setStatusCar();
}
