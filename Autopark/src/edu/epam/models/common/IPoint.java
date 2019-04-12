package edu.epam.models.common;

/**
 * @author konstantin Zaharov
 * The {@code IPoint} inteface uses for define basic methods for use it with data base
 */

public interface IPoint {
    void addPointToDB(Point point);
    void removePointFromDB(Point point);
}
