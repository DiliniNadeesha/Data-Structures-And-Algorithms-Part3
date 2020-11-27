class A extends Object{
    public A(String name){
        super();
        System.out.println(((B) this).a);
    }
}

class B extends A{
    int a = 10;
    public B(){
        this("Kasun");
    }
    public B(String name){
        super(name);
    }
}

public class AppInitializer2 {
    public static void main(String[] args) {
        new B();
    }
}
