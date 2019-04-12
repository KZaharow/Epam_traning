package edu.epam.models.car;

import java.util.Objects;

/**
 * @author konstantin Zaharov
 * The {@code CarModel} class uses for create, add and remove car model to/from db table 'car_model'
 */

public class CarModel implements ICarModel{

    // car fields
    private int carId;
    private String name;

    public CarModel(int carId, String name) {
        this.carId = carId;
        this.name = name;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void carModelAddToDB(CarModel carModel) {

    }

    @Override
    public void carModelRemoveFromDB(CarModel carModel) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel carModel = (CarModel) o;
        return carId == carModel.carId &&
                Objects.equals(name, carModel.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carId, name);
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "carId=" + carId +
                ", name='" + name + '\'' +
                '}';
    }
}
