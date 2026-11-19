package threads.Thread_states;



class A extends  Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Handle");
            }
        }
    }


}
public class main {

    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        System.out.println(a.getState());

        a.start();
        System.out.println(a.getState());

        a.sleep(1000);
        System.out.println(a.getState());
        a.join();
        System.out.println(a.getState());
    }


}
