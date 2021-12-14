
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    public void setup() {
        rectangle = new Rectangle();
    }

    @Test()
    public void checkAreaIsTenWhenLengthIsFiveAndBreadthIsTwo() {
        double area = rectangle.area(5, 2);
        double expected = 5 * 2;
        assertEquals(expected, area);
    }

    @Test()
    public void checkPerimeterIsSixteenWhenLengthIsFourAndWidthIsFour() {
        double perimeter = rectangle.perimeter(4, 4);
        double expected = 2 * (4 + 4);
        assertEquals(expected, perimeter);
    }
}