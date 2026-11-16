package OOPS.Abstraction.Abstractkeyword;

abstract class Employee{
    void display(){
        System.out.println("show detalis ...");
    }

    abstract void show();

}

class A extends Employee{
    void show(){
        System.out.println("Display details ..");
    }
}
public class main {
    public static void main(String[] args) {
        
        Employee e = new A();
        e.display();
        // e.show();

    }

}
