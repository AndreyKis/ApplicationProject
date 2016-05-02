import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by User on 01.05.2016.
 */
//This is the way to test program with parameterized option.
@RunWith(Parameterized.class)
public class JUnitTestsParams {
    private Circle circle;
    private Point point;
    private Object expected;

    @Parameterized.Parameters
    public static List<Object[]> getParameters() {
        return Arrays.asList(new Object[][] {
                {new Circle(new Point(0, 0), 3), new Point(-2, 3), false},
                {new Circle(new Point(0, 0), 3), new Point(2, 3), false},
                {new Circle(new Point(0, 0), 3), new Point(3, 3), false},
                {new Circle(new Point(0, 0), 3), new Point(0, 0), true}
        });
    }

    public JUnitTestsParams(Circle circle, Point point, Object expected){
        this.circle = circle;
        this.point = point;
        this.expected = expected;
    }

    @Test
    public void testCircleTrue() {
        assertEquals(circle.isInside(point), expected);
    }
}
