import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public  class SquareTest {
     private Square square;

     @Test
       public  void checkErrorWhenSideIsNegative(){
       assertThrows(IllegalArgumentException.class,()->new Square(-2));
      }

     @Test
     public void checkErrorWhenSideIsZero(){
         assertThrows(IllegalArgumentException.class,()->new Square(0));
     }

   @Nested
    class TestArea{
       @Test
       public void checkAreaIsTwentyFiveWhenSideIsFive(){
           square = new Square(5);
           double actualArea = square.area();
           double expectedArea= 25 ;
           assertEquals(expectedArea , actualArea);
       }
   }

   @Nested
    class TestPerimeter{
       @Test
       public  void  checkPerimeterIsTwentyWhenSideIsFive() {
           square = new Square(5);
           double  actualPerimeter = square.perimeter();
           double expectedPerimeter = 20;
           assertEquals(expectedPerimeter, actualPerimeter);

       }
   }

}