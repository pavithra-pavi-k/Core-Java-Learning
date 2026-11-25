package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ReduceExample {


    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(0,2,3,4,2);

        Stream<Integer>  stream = list.stream();


        //Annonamous class
        BinaryOperator<Integer>  binaryOperator = new BinaryOperator<Integer>() {
              public  Integer apply(Integer a, Integer b){
                return a+b;
            }
            
        };


        //lamda expression

        BinaryOperator<Integer> binaryOperator2=(a,b)->a+b;
        //int sum=stream.reduce(0, binaryOperator2);
        int sum2=stream.reduce(0,(a,b)->a+b);
        System.out.println(sum2);

        Consumer<Integer> consumer = new Consumer<>() {
            public void accept(Integer a){
                System.out.println("Hello");
            }        
        };

        list.forEach(consumer);

        Consumer<Integer> consumer2 = (a)-> System.out.println("Welocme to TNS");
        list.forEach(consumer2);


        //using fliter,map and reduce  1st filetr even and map square of even and reduce sum of number

        int sum = list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->(a+b));

        System.out.println("sum of even number  = "+sum);

    }
}



      