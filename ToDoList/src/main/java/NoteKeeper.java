import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

//1. As a note keeper I want to add items to my todo list.
//        2. As a note keeper I want to remove items from my todo list.
//        3. As a note keeper,
//        I want to be able to bring back the removed items. (un remove)
//        4. As a note keeper,
//        I want to toggle between completed and not completed.
public class NoteKeeper {
    PriorityQueue<String> todoListCompleted = new PriorityQueue<>();
    PriorityQueue<String> todoListNotCompleted = new PriorityQueue<>();
    ArrayList<String > removeList = new ArrayList<>();
    PriorityQueue<String> todoList = new PriorityQueue<>();

    public  void  addList(String item , boolean completedOrNotCompleted){
        if(completedOrNotCompleted){
            todoListCompleted.add(item);
            todoList.addAll(todoListCompleted);
        }else{

            todoListNotCompleted.add(item);
            todoList.addAll(todoListNotCompleted);
        }
    }
    public  String checkList(String item){
        String existingItem = null;
        for(String list : todoList){
            if(list.contains(item)){
                existingItem = item;
                break;
            }
        }
        return  existingItem;
    }

    public  PriorityQueue removeList(String item){
        todoList.removeIf(list -> list == item);
        return  todoList;
    }

  public  PriorityQueue<String> unRemoveList(String item){
        removeList.add(item);
        todoList.removeIf(list -> list ==item);
        todoList.addAll(removeList);
        return todoList;
  }
  public  boolean comletedOrNotCompleted(String completedOrNotCompletedList){
        boolean task = false;
        for(String list : todoListCompleted){
            if(list == completedOrNotCompletedList){
                task = true;
            }
        }
        for(String list : todoListNotCompleted){
            if(list == completedOrNotCompletedList){
                task = false;
            }
        }
        return  task;
  }
}
