package edu.epam.models.car;

/**
 * @author konstantin Zaharov
 * The {@code ICarModel} inteface uses for define basic methods for use it with data base
 */

public interface ICarModel {
    void carModelAddToDB(CarModel carModel);
    void carModelRemoveFromDB(CarModel carModel);
}
