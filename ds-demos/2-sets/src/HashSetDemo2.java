import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("ijse");
        mySet.add("nsbm");
        mySet.add("esoft");
        mySet.add("ijse");
        System.out.println("-----------------------");
        for (String value : mySet) {
            System.out.println(value);
        }
    }
}
