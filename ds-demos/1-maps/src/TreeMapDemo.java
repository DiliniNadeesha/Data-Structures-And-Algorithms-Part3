import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new TreeMap<>();
        myMap.put("gaka",10);
        myMap.put("aviya", 20);
        myMap.put("sanoj", 30);
        myMap.put("chiki", 40);
        System.out.println(myMap);

        Map<Integer, String> myMap2 = new TreeMap<>();
        myMap2.put(20,"aviya");
        myMap2.put(10, "gaka");
        myMap2.put(40,"chiki");
        myMap2.put(30, "sanoj");
        System.out.println(myMap2);
    }
}
