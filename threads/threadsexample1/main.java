package threadsexample1;


class A extends Thread{
    public void run(){
        //Thread.currentThread().setPriority(1);
        
        for(int i=1;i<=10;i++){

            try{
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());

            }
            catch(InterruptedException e){
            System.out.println("Handle");

            }

        }
    }
}


class B extends Thread{
    public void run(){
        //Thread.currentThread().setPriority(1);
        
        for(int i=11;i<=20;i++){

                System.out.println(Thread.currentThread().getName());

            
        }
    }
}


class c extends Thread{
    public void run(){
       // Thread.currentThread().setPriority(1);
        
        for(int i=21;i<=30;i++){

                System.out.println(Thread.currentThread().getName());

            


        }
    }
}
public class main {

    public static void main(String[] args) throws InterruptedException{
        A a = new A();
        a.setPriority(Thread.MIN_PRIORITY);
       // a.start();

        B b = new B();
        b.setPriority(Thread.MIN_PRIORITY);
      //  b.start();

        c c = new c();
        c.setPriority(Thread.MAX_PRIORITY);
        //c.start();

        c.start();
        c.join();
        a.start();
        b.start();

    }

}
