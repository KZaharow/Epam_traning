package edu.epam.models.driver;

import edu.epam.models.car.ICar;

import java.util.Objects;

/**
 * @author konstantin Zaharov
 * The {@code Driver} class includes description of autopark drivers
 * which can check car's status and has possibility to close order
 * means set order status as closed (finished)
 */

public class Driver implements ICar, IDriver {

    // basic driver fields
    private int driverId;
    private String driverName;
    private String driverSourname;
    //driverCategory is a value from Enum
    private DriversCategoryEnum driverCategory;

    public Driver(int driverId, String driverName, String driverSourname, DriversCategoryEnum driverCategory) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.driverSourname = driverSourname;
        this.driverCategory = driverCategory;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverSourname() {
        return driverSourname;
    }

    public void setDriverSourname(String driverSourname) {
        this.driverSourname = driverSourname;
    }

    public DriversCategoryEnum getDriverCategory() {
        return driverCategory;
    }

    public void setDriverCategory(DriversCategoryEnum driverCategory) {
        this.driverCategory = driverCategory;
    }

    @Override
    public void setStatusCar() {

    }

    @Override
    public void closeOrder() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return driverId == driver.driverId &&
                Objects.equals(driverName, driver.driverName) &&
                Objects.equals(driverSourname, driver.driverSourname) &&
                driverCategory == driver.driverCategory;
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverId, driverName, driverSourname, driverCategory);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", driverName='" + driverName + '\'' +
                ", driverSourname='" + driverSourname + '\'' +
                ", driverCategory=" + driverCategory +
                '}';
    }
}
