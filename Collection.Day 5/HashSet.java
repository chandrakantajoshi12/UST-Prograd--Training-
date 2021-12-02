import  java.util.HashSet;

import java.util.List;

public class Company {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        List n = List.of("Employee1","Employee2","Employee3","Employee4","Employee5");
        hs.add("CEO");
        hs.add("H.R");
        hs.add("Manager");
        hs.add("Employees");
        hs.addAll(n);
        System.out.println(hs.isEmpty());
        hs.remove(1);
        System.out.println(hs);
    }
}