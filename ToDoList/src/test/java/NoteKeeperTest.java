import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class NoteKeeperTest {
    NoteKeeper noteKeeper = new NoteKeeper();
//   @BeforeEach
//    public  void addItemCompletedOrNotCompleted(){
//       noteKeeper.completedOrNotCompletedList("Homework");
//       noteKeeper.completedOrNotCompletedList("Assignment"  );
//       noteKeeper.completedOrNotCompletedList("Exercise Daily");
//       noteKeeper.completedOrNotCompletedList("Sleep on Time" );
//   }
   @Test
   public void addItem(){
       PriorityQueue actualList = noteKeeper.addList("Breakfast");
        PriorityQueue expectedList = new PriorityQueue(List.of("Breakfast"));
          assertEquals(expectedList,actualList);
   }
    @Test
    public  void  completedOrNotCompletedList(){
         noteKeeper.completedOrNotCompletedList("Homework",true);
    }
   @Test
    public void addItemInTodoList(){
       String actualList= noteKeeper.checkList("Homework");
       assertEquals("Homework",actualList);
   }
   @Test
    public  void removeItemFromTodoList(){
       PriorityQueue actualList = noteKeeper.removeList("Assignment");
       PriorityQueue expectedList = new PriorityQueue(List.of("Exercise Daily","Homework" ,"Homework","Sleep on Time"));
       assertArrayEquals( expectedList.toArray(),actualList.toArray());
   }
   @Test
    public  void unRemoveItemsFromToDoList(){
       PriorityQueue actualList = noteKeeper.unRemoveList("Assignment");
       PriorityQueue expectedList = new PriorityQueue((List.of("Assignment","Exercise Daily", "Homework","Sleep on Time" ,"Homework")));
       assertArrayEquals(expectedList.toArray(),actualList.toArray());
   }
   @Nested
   public  class toggleBetweenCompletedAndNotCompletedToDoList{
       @Test
       public  void checkIfTaskIsCompleted(){
           boolean actualList = noteKeeper.completedOrNotCompleted("Homework");
           assertEquals(true,actualList);
       }
       @Test
       public  void checkIfTaskIsNotCompleted(){
           boolean actualList = noteKeeper.completedOrNotCompleted("Assignment");
           assertEquals(false,actualList);
       }
   }


}