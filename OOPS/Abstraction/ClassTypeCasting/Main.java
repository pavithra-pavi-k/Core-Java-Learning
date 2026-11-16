package OOPS.Abstraction.ClassTypeCasting;



class A{
    void disp(){
        System.out.println("show  hello");

    }
}

class B extends A{
    void show(){
        System.out.println("Welocme to java class");

    }
}
public class Main {
    public static void main(String[] args) {
        

        //upcasting 

        //done by both implict and expicitly
        B b = new B();
        A a = new B();
        a.disp();


       //downcasting
       //without upcasting we cant perform down casting 
       //done by explicity

        A a1 = new B();
        B b1 = (B) a1;
        b1.show();
        b1.disp();
    
    }

}
