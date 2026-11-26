package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapToIntExample {

    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9,10);

        Stream<Integer> square = list.stream();

        int sum  = list.stream().map(n->n*2).reduce(0,(a,b)->(a+b));
        

        System.out.println("Sum of number multipled by 2 = "+sum);

        int sum2 = list.stream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println(sum2);

        


    }

}
