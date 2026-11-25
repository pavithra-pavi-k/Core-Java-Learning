package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        
        //annonamous class
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> square = list.stream();

        Function<Integer,Integer> function = new Function<>() {

            public Integer apply(Integer a){
                return  a*a;
            }
        };


        //lamda expression
        Function<Integer,Integer> function2=(a)-> a*a;
            
     
        square.map((a)-> a*a).forEach(n->System.out.println(n));
        
    
    }

}
