import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    Statistics statistics = new Statistics();
    @Nested
    public  class HeadsIsEqualToTails{
        @Test
        public void checkIfProbabilityOfHeadsAndTails(){
          assertEquals(statistics.probabilityOfHeads(),statistics.probabilityOfTail());
        }
    }

    @Nested //  probability of two events occurring together
    public class TwoCoinEventsOccurringTogether{
        @Test
        public void checkIfProbabilityOfHeadIsPointTwoFive(){
            assertEquals(0.25,statistics.probabilityOfTwoEvents());
        }
        @Test
        public void checkIfProbabilityOfTailIsPointTwoFive(){
            assertEquals(0.25,statistics.probabilityOfTwoEvents());
        }
        @Test
        public void checkIfProbabilityOfHeadAndProbabilityOfTailIsPointTwoFive(){
            assertEquals(0.25,statistics.probabilityOfTwoEvents());
        }

        @Test
        public void checkIfProbabilityOfTailAndProbabilityOfHeadIsPointTwoFive(){
            assertEquals(0.25,statistics.probabilityOfTwoEvents());
        }

    }

    @Nested
    public class TwoCoinsEventsWereNotOccurringTogether{
        @Test
        public void checkIfProbabilityOfTwoCoinSEventsNotOccurringTogether(){
            assertEquals(0.75, statistics.probabilityOfNotGettingTwoEventsTogether());
        }
    }

    @Nested // probability of either two events occurring
    public class EitherOfTwoCoinEventsOccurring{
        @Test
        public void checkIfProbabilityOfEitherTwoCoinsEventsOccurring(){
            assertEquals(0.75,statistics.probabilityOfNotGettingTwoEventsTogether());
        }
        @Test
        public  void  checkWhenProbabilityIsNegative(){
            assertThrows(IllegalArgumentException.class,()-> statistics.whenProbabilityIsNegative(-1));

    }
}

}