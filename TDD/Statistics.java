//As a statistician, I want to be able to know that the probability of a
// heads in a coin toss is equal
// to the probability of a tails in a coin toss.
//As a statistician, I want to be able to know the probability
// of two events occurring together.
//As a statistician, I want to be able to know the probability
// of an event not occurring.
//As a statistician, I want to be able to know the probability
// of either two events occurring.
public class Statistics {
    double head;
    double tail;
    public  double whenProbabilityIsNegative(double probability){
        if(probability<0){
            throw  new IllegalArgumentException("Probability is always Positive");
        }
        return  0;
    }

   public  double probabilityOfHeads(){
        return  head = 0.5;
   }
   public  double probabilityOfTail(){
        return  tail = 0.5;
   }
   public  double probabilityOfTwoEvents(){
        return  probabilityOfHeads()*probabilityOfTail();
   }
   public  double probabilityOfNotGettingTwoEventsTogether(){
        return 1-probabilityOfTwoEvents();
    }
   public  double probabilityOfGettingEitherTwoEvents(){
       return  probabilityOfHeads()+probabilityOfTail()- probabilityOfTwoEvents();
   }
}
