/**
 * Created by User on 29.04.2016.
 */
public class Circle {
    Point center;
    private double r;

    public Circle()
    {

    }
    public Circle(Point center, double r)
    {
        this.r = r;
        this.center = center;
    }

    public boolean isInside(Point p)
    {
        double distToCntr = center.DistToPoint(p);
        //got rid of square root this way
        return distToCntr < r * r;
    }
}
