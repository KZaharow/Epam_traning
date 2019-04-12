package edu.epam.models.car;

import edu.epam.models.driver.Driver;

import java.util.Objects;

/**
 * @author konstantin Zaharov
 * The {@code Car} class uses for create car instance which will be use in
 * orders
 */

public class Car{

    private int carId;
    private String carRegNum;
    private CarModel carModel;
    private Driver carDriver;
    private CarStatusEnum carStatusEnum;

    public Car(int carId, String carRegNum, CarModel carModel, Driver carDriver, CarStatusEnum carStatusEnum) {
        this.carId = carId;
        this.carRegNum = carRegNum;
        this.carModel = carModel;
        this.carDriver = carDriver;
        this.carStatusEnum = carStatusEnum;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarRegNum() {
        return carRegNum;
    }

    public void setCarRegNum(String carRegNum) {
        this.carRegNum = carRegNum;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public Driver getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }

    public CarStatusEnum getCarStatusEnum() {
        return carStatusEnum;
    }

    public void setCarStatusEnum(CarStatusEnum carStatusEnum) {
        this.carStatusEnum = carStatusEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return carId == car.carId &&
                Objects.equals(carRegNum, car.carRegNum) &&
                Objects.equals(carModel, car.carModel) &&
                Objects.equals(carDriver, car.carDriver) &&
                carStatusEnum == car.carStatusEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carId, carRegNum, carModel, carDriver, carStatusEnum);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", carRegNum='" + carRegNum + '\'' +
                ", carModel=" + carModel +
                ", carDriver=" + carDriver +
                ", carStatusEnum=" + carStatusEnum +
                '}';
    }
}
