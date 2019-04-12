package edu.epam.models.common;

import java.util.Objects;

/**
 * @author konstantin Zaharov
 * The {@code Route} class uses for create a route based on Points
 * there are simple route betwee points routeBeginPoint and routeEndPoint
 */

public class Route implements IRoute{

    //just simple fields of route
    private int routeID;
    private Point routeBeginPoint;
    private Point routeEndPoint;

    public Route(int routeID, Point routeBeginPoint, Point routeEndPoint) {
        this.routeID = routeID;
        this.routeBeginPoint = routeBeginPoint;
        this.routeEndPoint = routeEndPoint;
    }

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public Point getRouteBeginPoint() {
        return routeBeginPoint;
    }

    public void setRouteBeginPoint(Point routeBeginPoint) {
        this.routeBeginPoint = routeBeginPoint;
    }

    public Point getRouteEndPoint() {
        return routeEndPoint;
    }

    public void setRouteEndPoint(Point routeEndPoint) {
        this.routeEndPoint = routeEndPoint;
    }

    @Override
    public void addRouteToDB(Point point) {

    }

    @Override
    public void removeRouteFromDB(Point point) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return routeID == route.routeID &&
                Objects.equals(routeBeginPoint, route.routeBeginPoint) &&
                Objects.equals(routeEndPoint, route.routeEndPoint);
    }

    @Override
    public int hashCode() {

        return Objects.hash(routeID, routeBeginPoint, routeEndPoint);
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeID=" + routeID +
                ", routeBeginPoint=" + routeBeginPoint +
                ", routeEndPoint=" + routeEndPoint +
                '}';
    }
}
