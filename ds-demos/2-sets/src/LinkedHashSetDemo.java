import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<Integer> mySet1 = new LinkedHashSet<>();
        mySet1.add(20);
        mySet1.add(10);
        mySet1.add(50);
        mySet1.add(30);
        System.out.println(mySet1);

        LinkedHashSet<String> mySet2 = new LinkedHashSet<>();
        mySet2.add("Aviya");
        mySet2.add("Gaka");
        mySet2.add("Irushi");
        mySet2.add("Bolea");
        mySet2.add("Thariya");
        System.out.println(mySet2);

        LinkedHashSet<Student> mySet3 = new LinkedHashSet<>();
        mySet3.add(new Student("S004", "Gaka"));
        mySet3.add(new Student("S002", "Tharaka"));
        mySet3.add(new Student("S003", "Poornima"));
        for (Student student : mySet3) {
            System.out.println(student);
        }
    }
}
