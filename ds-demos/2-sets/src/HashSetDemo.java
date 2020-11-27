import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(10);
        System.out.println(mySet.size());
        System.out.println(mySet);
        System.out.println(mySet.contains(50));
        Iterator<Integer> iterator = mySet.iterator();
        System.out.println("-----------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------");
        for (Integer value : mySet) {
            System.out.println(value);
        }
    }
}
