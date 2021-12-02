import java.util.Map;

public class HashMap {
    public static void main(String[] args){
        Map<Integer , String>map= new java.util.HashMap<>();
        map.put(1, "Hemant");
        map.put(2, "Garima");
        map.put(3, "Priyanka");
        map.put(4,"Ansh");
        map.putIfAbsent(5,"Ashwin");
        for(Map.Entry<Integer, String>m: map.entrySet()){
            System.out.println(m.getKey()+"-->"+m.getValue());
        }
        System.out.println(map);
    }
}