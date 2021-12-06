
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;


class TreeMapRoll {
    public static void main(String[] args) {
        TreeMap<Integer, String> roll = new TreeMap<>();
        roll .put(01, "Aayushi");
        roll .put(02, "Bhanu");
        roll .put(03, "Riddhima");
        roll .put(04, "Priya");
        System.out.println(roll );
        for (Map.Entry<Integer, String> map : roll .entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
        Set<Integer> keySet = roll .descendingKeySet();
        System.out.println(roll );
        for (Integer key : keySet) {
            System.out.println(key + " " +roll .get(key));
        }
    }
}