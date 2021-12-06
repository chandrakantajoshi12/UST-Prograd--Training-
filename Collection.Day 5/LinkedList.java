import  java.util.LinkedList;
public class Linkedlist {
  public static void main(String[] args){
      LinkedList<String> linkedList = new LinkedList<>();
      linkedList.add("apple");
      linkedList.add("banana");
      linkedList.add("mango");
      linkedList.add("kivi");
      System.out.println(linkedList);
      linkedList.remove(3);
      System.out.println(linkedList);
      linkedList.forEach(fruits -> System.out.println((fruits)));
      System.out.println(linkedList.lastIndexOf("kivi"));
      linkedList.addLast("orange");
      linkedList.forEach(fruits -> System.out.println((fruits)));
      linkedList.set(1,"papaya");
      linkedList.get(3);
      System.out.println(linkedList);
  }
}
