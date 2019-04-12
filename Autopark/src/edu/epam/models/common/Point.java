package edu.epam.models.common;

import java.util.Objects;

/**
 * @author konstantin Zaharov
 * The {@code Point} class uses for create a route point
 * orders
 */

public class Point implements IPoint  {

    //just simple fields of route point
    private int pointID;
    private String pointName;

    public Point(int pointID, String pointName) {
        this.pointID = pointID;
        this.pointName = pointName;
    }

    public int getPointID() {
        return pointID;
    }

    public void setPointID(int pointID) {
        this.pointID = pointID;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    @Override
    public void addPointToDB(Point point) {

    }

    @Override
    public void removePointFromDB(Point point) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return pointID == point.pointID &&
                Objects.equals(pointName, point.pointName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pointID, pointName);
    }

    @Override
    public String toString() {
        return "Point{" +
                "pointID=" + pointID +
                ", pointName='" + pointName + '\'' +
                '}';
    }
}
