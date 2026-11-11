package MethodExample;

public class Example1 {

    public static void add(int a, int b){
        System.out.println(a+b);

    }

    public static int sum(int a, int b){
        return a+b;

    }

    public static int mul(){
        return 2*3;
    }
    public static void dev(){
        System.out.println(10/2);
    }

    public static void main(String[] args){

        add(2,5);
      //  sum(2,2);it will not show the 7 as output bcz its inly return value doesnt prints by printf need to print the output
        System.out.println(sum(2,6));

        System.out.println(mul());
        dev();


    }

}
