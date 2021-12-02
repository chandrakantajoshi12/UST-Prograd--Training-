import java.util.List;
import java.util.TreeSet;

public class Mall {
    public static void main(String[] args){
        TreeSet<String> shop = new TreeSet<>();
         shop.add("Cosmetics");
        shop.add("Coffee Cafe");
        shop.add("Ice Cream ");
         shop.add("PVR");
         shop.add("Game");
         shop.isEmpty();
         shop.addAll(List.of("Grocery","Chai Tappry","Clothes"));
        System.out.println(shop);
    }
   }
