import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {
    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();
        Student appu = new Student("S001", "Appu");
        System.out.println(appu.hashCode());
        mySet.add(appu);
        mySet.add(new Student("S002","Tharaka"));
        mySet.add(new Student("S003","Poornima"));
        mySet.add(new Student("S004","Gaka"));
        Student appu2 = new Student("S001", "Appu-v2");
        System.out.println(appu2.hashCode());
        System.out.println(appu.equals(appu2));
        mySet.add(appu2);
        System.out.println("-----------------------");
        for (Student value : mySet) {
            System.out.println(value);
        }
    }
}
