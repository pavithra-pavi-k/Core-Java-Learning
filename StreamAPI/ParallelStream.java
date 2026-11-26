package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStream {

    public static void main(String[] args) {

        int size = 10;

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i=1;i<size;i++){
            list.add(random.nextInt(100));
        }

        //System.out.println(list);
        long startStream = System.currentTimeMillis();
        int sum  = list.stream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println("normal Stream  = "+sum);
        long endStream = System.currentTimeMillis();


        long startPar = System.currentTimeMillis();
        int sum2 =list.parallelStream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println("Parallel stream = " +sum2);
        long endPar = System.currentTimeMillis();


        System.out.println("Normal Stream time : " +(endStream-startStream));
        System.out.println("Parallel stream time : "+(endPar-startPar));
    }

}
