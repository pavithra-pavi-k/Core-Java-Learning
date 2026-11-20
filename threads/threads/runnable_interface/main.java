package threads.runnable_interface;



class A {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class B {
    public void run(){
        for(int i=11;i<=20;i++){
            System.out.println(i);
        }
    }
}

interface d{
    void show();

}
interface e{
    void show();
}
class C{
   public void show(){
    System.out.println("hello");

   }
}
public class main {
    public static void main(String[] args) {
        A a=new A();
        Runnable t1=new Thread(a);
        t1.run();
        B b=new B();
        Thread t2=new Thread(b);
        t2.start();  
    }
}