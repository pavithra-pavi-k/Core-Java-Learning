package CollectionFrameworkDemo.Set;

interface  A{
    void show();
    void disp();
}


@FunctionalInterface 
interface B{
    int pay(int a, int b);
}



public class Example3 {

    public static void main(String[] args) {
        
        A a = new A(){
            public void show(){
                System.out.println("Hello");
            }

            public  void disp(){
                System.out.println("welcome to TNS");
            }
        };



        B b = (a2,b2)-> a2+b2;
        int sum = b.pay(3,9);
        System.out.println(sum);
    }

}
