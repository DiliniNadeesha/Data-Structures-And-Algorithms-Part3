import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> mySortedSet = new TreeSet<>();
        mySortedSet.add(20);
        mySortedSet.add(10);
        mySortedSet.add(50);
        mySortedSet.add(30);
        System.out.println(mySortedSet);

        TreeSet<String> myStringSortedSet = new TreeSet<>();
        myStringSortedSet.add("Aviya");
        myStringSortedSet.add("Gaka");
        myStringSortedSet.add("Irushi");
        myStringSortedSet.add("Bolea");
        myStringSortedSet.add("Thariya");
        System.out.println(myStringSortedSet);

        TreeSet<Student> myStudentSet = new TreeSet<>();
        myStudentSet.add(new Student("S004","Gaka"));
        myStudentSet.add(new Student("S002","Tharaka"));
        myStudentSet.add(new Student("S003","Poornima"));
        for (Student student : myStudentSet) {
            System.out.println(student);
        }

//        String s1 = "S001";
//        String s2 = "S002";
//        System.out.println(s1.compareTo(s2));
    }
}
