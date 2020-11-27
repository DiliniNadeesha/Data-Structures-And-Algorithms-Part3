import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(10,"ijse");
        myMap.put(20,"esoft");
        myMap.put(30,"sliit");
        System.out.println(myMap.get(10));
        myMap.put(10,"nsbm");
        System.out.println(myMap.get(10));
        System.out.println(myMap.size());
    }
}
