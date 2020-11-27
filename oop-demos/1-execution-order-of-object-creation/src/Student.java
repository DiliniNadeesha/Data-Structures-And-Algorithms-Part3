public class Student {
    static{
        System.out.println("Student Class Object is being loaded");
    }
    {
//        System.out.println(i);
    }
    int a = someInstanceMethod();
    int i;
    byte b;
    double d;
    float f;
    short s;
    long l;
    char c;
    private int someInstanceMethod() {
        System.out.println("Initialize Instance Variable");
        return 0;
    }
    {
        System.out.println("S: Instance Initializer 1");
    }
    public Student() {

        System.out.println("S: Constructor");
//        System.out.println("Char: " + b);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("c = " + (c+0));
    }
    {
        System.out.println("S: Instance Initializer 2");
    }
}
