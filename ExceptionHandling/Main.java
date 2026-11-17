package ExceptionHandling;

public class Main {

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4};
       // System.out.println(arr[5]);//wont work and next line also not executed so we use try block to avoid this
       try{
        System.out.println(arr[5]);
        System.out.println("hello");//no error than also wont execute
        System.out.println(arr[2]);
       }
       catch(ArithmeticException e){
        System.out.println("Exception handling");
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("hello everyone");
       }

       catch(Exception e){
        System.out.println("handle");
       }

       finally{
        
        System.out.println("Hello world finally");
       }
    }

}
