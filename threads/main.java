class A{
    void disp(){
        System.out.println(Thread.currentThread().getName());
        
    }
}



public class main {


    void show(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

    }
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getId());
        
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());

        main m = new main();
        m.show();

        A a = new A();
        a.disp();

    }

}
