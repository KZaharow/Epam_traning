package edu.epam;

import edu.epam.models.car.Car;
import edu.epam.models.car.CarModel;
import edu.epam.models.car.CarStatusEnum;
import edu.epam.models.common.Point;
import edu.epam.models.common.Route;
import edu.epam.models.dispatcher.Dispatcher;
import edu.epam.models.driver.Driver;
import edu.epam.models.driver.DriversCategoryEnum;
import edu.epam.models.order.Order;
import edu.epam.models.order.OrderStatusEnum;

/**
 * @author konstantin Zaharov
 * The {@code Runner} is a start point of program
 * task 17
 * Система Автобаза. Диспетчер распределяет Заявки на Рейсы между Водителями,
 * за каждым из которых закреплен свой Автомобиль. На Рейс может быть назначен Автомобиль,
 * находящийся в исправном состоянии и характеристики которого соответствуют Заявке.
 * Водитель делает отметку о выполнении Рейса и состоянии Автомобиля.
 */

public class Runner {

    public static void main(String[] args) {
        //let's start and create order

        //Dispatcher ia a person who call new order for specified parametrs
        Dispatcher dispatcher = new Dispatcher(1, "Donald");

        /*Define of order
         driver: Alex White, 2 category;
         car: Renault Master, aa1020ei-3, status - AVAILIBLE;
         from: Gomel to: Minsk
        */
        Driver driver = new Driver(1, "Alex", "White", DriversCategoryEnum.CATEGORY_2);
        CarModel carModel = new CarModel(1, "Renault Master");
        Car car = new Car(1, "aa1020ei-3", carModel, driver, CarStatusEnum.AVAILIBLE);
        Point pointBegin = new Point(375, "Gomel");
        Point pointEnd = new Point(017, "Minsk");
        Route route = new Route(1, pointBegin, pointEnd);

        //check if sellected car
        if (car.getCarStatusEnum() == CarStatusEnum.AVAILIBLE) {
            Order order = new Order(1, OrderStatusEnum.OPENED, "2019-04-10, 10-40", null, car, route, "warning glass!");
            dispatcher.openOrder(order);
            System.out.println(order.toString());
        }
    }
}
