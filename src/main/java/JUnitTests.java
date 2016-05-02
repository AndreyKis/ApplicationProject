import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.*;

/**
 * Created by User on 02.05.2016.
 */
public class JUnitTests {
    @Test
    public void falseCalls(){
        assertFalse(new Circle(new Point(0, 0), 3).isInside(new Point(-2, 3)));
        assertFalse(new Circle(new Point(0, 0), 3).isInside(new Point(2, 3)));
        assertFalse(new Circle(new Point(0, 0), 3).isInside(new Point(-2, 3)));
        // not inside, but on the line, got false here unexpectedly (forgot, that I used <, not <=
        assertFalse(new Circle(new Point(0, 0), 3).isInside(new Point(0, 3)));
    }

    @Test
    public void trueCalls(){
        assertTrue(new Circle(new Point(0, 0), 3).isInside(new Point(0, 0)));

        assertTrue(new Circle(new Point(0, 0), 3).isInside(new Point(1, 1)));
    }

    @Test(expected = NullPointerException.class)
    public void nullCalls(){
        Circle circle1 = new Circle();
        Circle circle2 = null;
        Point point = new Point(3, 3);
        circle1.isInside(point);
        circle2.isInside(point);
    }

    @Test
    public void unusualTests(){
        assertTrue(new Circle(new Point(0, 0), -3).isInside(new Point(1, 1)));
        assertTrue(new Circle(new Point(0.25, 0.5), 0.45).isInside(new Point(0.11, 0.11)));
        assertTrue(new Circle(new Point(-1, -1), 10).isInside(new Point(-5, -5)));
        assertTrue(new Circle(new Point(Double.MAX_VALUE + 1, Double.MIN_VALUE - 1), Double.MAX_VALUE).isInside(
                new Point(Double.MAX_VALUE, Double.MIN_VALUE)
        ));
    }
}
