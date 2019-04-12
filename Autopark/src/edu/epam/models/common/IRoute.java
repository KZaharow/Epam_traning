package edu.epam.models.common;


/**
 * @author konstantin Zaharov
 * The {@code IPoint} inteface uses for define basic methods for use it with data base
 */

public interface IRoute {
    void addRouteToDB(Point point);
    void removeRouteFromDB(Point point);
}