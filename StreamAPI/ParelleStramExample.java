package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParelleStramExample {
    public static void main(String[] args) {
        

        int size =100;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for( int i =1 ;i<size;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        long startstream = System.currentTimeMillis();
        int sum = list.stream().filter(n->n%2==0).
        map(n->{
            try{
                Thread.sleep(10);
            }
            catch(Exception e){

            }

            return n*2;
        }
        ).mapToInt(n->n).sum();
        System.out.println("Noraml stream  = "+sum);
        long endStream = System.currentTimeMillis();


        long startPar = System.currentTimeMillis();
        int sum2 = list.parallelStream().filter(n->n%2==0)
        .map(n->{
            
            try{
                Thread.sleep(10);
            }
            catch(Exception e){

            }

            return n*2;
        }).mapToInt(n->n).sum();
        System.out.println("Parallel stream = "+sum2);
        Long endPar = System.currentTimeMillis();

        System.out.println("Normal stream time = "+(endStream-startstream));
        System.out.println("Parallel stream time  = "+(endPar-startPar));
    }

}
