import  java.util.Vector;
public class Vegetable {
   public static void  main(String[] args){
       Vector<String> vector = new Vector<String>();
        vector.add("Carrot");
        vector.add("Tomato");
        vector.add("Onions");
        vector.addElement("Potato");
       System.out.println(vector);
       System.out.println(vector.firstElement());
       System.out.println(vector.lastElement());
       System.out.println(vector);
       System.out.println(vector.contains("Tomato"));
        vector.remove("Onions");
       System.out.println(vector);
        vector.forEach(veg -> System.out.println(veg));
       System.out.println(vector);
   }
}

