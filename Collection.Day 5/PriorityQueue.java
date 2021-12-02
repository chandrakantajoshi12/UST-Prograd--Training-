import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Friends {
    public  static void main(String[] args){
        PriorityQueue<String> pq = new PriorityQueue();
        pq.add("Hemant");
        pq.add("Garima");
        pq.add("Ayushi");
        pq.add("Ayushi");
        pq.forEach(friend -> System.out.println((friend)));

        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
