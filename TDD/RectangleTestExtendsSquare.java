import com.rectangle.Rectangles;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

  public class RectanglesTest {
     private   Rectangles rectangles;

      @Test
      public void checkAreaIsErrorWhenLengthIsNegativeAndBreadth() {
          //rectangles = new Rectangles(-2, 5);
          assertThrows(IllegalArgumentException.class,()-> new Rectangles(-2,-4));
      }

    @Nested
    class TestArea {
        @Test
        public void checkAreaIsTenWhenLengthTwoAndBreadthIsFive() {
            rectangles = new Rectangles(2, 5);
            double actualArea = rectangles.area();
            double expectedArea = 10;
            assertEquals(expectedArea, actualArea);
        }

//        @Test
//        public void throwExceptionWhenMeasurementsBecomeNegativeOrZero(){
//          Assertions.assertThrows(IllegalArgumentException.class, () -> {
//                Rectangle ar = new Rectangle(-2,-4);
//                ar.area();
//            });
//        }
    }


    @Nested
   class TestPerimeter {
    @Test
    public  void  checkPerimeterIsWhenLengthIsFourteen(){
        rectangles = new Rectangles(2, 5);
        double actualPerimeter = rectangles.perimeter();
        double expectedPerimeter = 14;
        assertEquals(expectedPerimeter, actualPerimeter);
   }
   }
   }