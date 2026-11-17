package ExceptionHandling;


public class ThrowThowsKeyword {

    public static void checkEVen(int num){

        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            throw new ArithmeticException("Not even number"); //not pass any message default it show null when you call e.getmesaage()
        }
    }
 

    public static void main(String[] args) {
        
        System.out.println("Hello");
        checkEVen(4);
        //checkEVen(5);

        try{
            checkEVen(5);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }

}
