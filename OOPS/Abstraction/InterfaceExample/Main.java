package OOPS.Abstraction.InterfaceExample;

/**
 * A
 */



interface A{
    public abstract void show();
    public static final int a= 10;
}

class B implements A{
    public void show(){
        System.out.println("Hello");
    }
}

public class Main {
 
    public static void main(String[] args) {
        
        A b = new B();
        b.show();
        System.out.println(A.a);
    }
}
