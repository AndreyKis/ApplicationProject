/**
 * Created by User on 29.04.2016.
 */

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double DistToPoint(Point p){
        double difX = (this.x - p.x)*(this.x - p.x);
        double difY = (this.y - p.y)*(this.y - p.y);
        double distance = difX + difY;
        return distance;
    }
}
