import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private  Calculator calculator;
    @BeforeEach  public  void  setup(){
    calculator = new Calculator();
      }

        @Test
        public void TwoSumThree() {
            double sum = calculator.sum(2, 3);
            double expected = 5;
            assertEquals(expected, sum);
        }

        @Test
        public void TenSumTen() {
            double sum = calculator.sum(10, 10);
            double expected = 20;
            assertEquals(expected, sum);
        }


       @Test
       public void FiveSubTwo() {
           double sub = calculator.sub(5, 2);
           double expected = 3;
           assertEquals(expected, sub);
       }


       @Test
       public void TwoMultiTwo() {

           double multi = calculator.multi(2, 2);
           double expected = 4;
           assertEquals(expected, multi);
       }

  @Test
    public void TendivTwo(){
        double div = calculator.div(10,2);
        double expected = 5;
        assertEquals(expected,div);

  }
  @Test
    public  void throwsExceptionWhenDividedByZero(){

        assertThrows(ArithmeticException.class,() ->calculator.div(10,0));
  }
}