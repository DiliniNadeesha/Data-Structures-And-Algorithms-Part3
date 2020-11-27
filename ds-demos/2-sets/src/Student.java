public class Student implements Comparable{
    private String id;
    private String name;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.getId().compareTo(s.getId());
        /*
        *  10.compareTo(20) := 10<20 return negative value
        *  10.compareTo(10) := 10=10 return zero value
        *  10.compareTo(20) := 10<20 return positive value
        * */
    }
}
