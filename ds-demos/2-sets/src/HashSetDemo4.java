import java.util.HashSet;
import java.util.Set;

public class HashSetDemo4 {

    public static void main(String[] args) {
        Employee chiki = new Employee(1, "Chiki");
        Employee irushi = new Employee(2, "Irushi");
        Employee chiki2 = new Employee(1, "Chiki");
        Set<Employee> employeeSet = new HashSet<>();

        System.out.println(chiki);
        System.out.println(irushi);
        boolean equals = chiki.equals(chiki2);
        System.out.println(equals);
        System.out.println(chiki.hashCode());
        System.out.println(chiki2.hashCode());
        System.out.println("---------------------");
        employeeSet.add(chiki);
        employeeSet.add(irushi);
        employeeSet.add(chiki2);
        System.out.println(employeeSet.size());

        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}
