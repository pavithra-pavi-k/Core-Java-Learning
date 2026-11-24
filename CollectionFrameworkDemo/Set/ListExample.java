package CollectionFrameworkDemo.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        
        List l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add("Hello");
        l.add(40);
        l.add(70.56);
        l.add('A');


        System.out.println(l);

        for (Object h:l){
            System.out.println(h);
        }

        System.out.println("removed 1st index  : "+ l.remove(1));
        



        // Integer

        // list.remove(Integer.valueOf(35));
        // System.out.println(list);

        System.out.println(l);

        // for (Object ob:list ) {
        //     System.out.println(ob);
        // }

        List<Integer> list2=Arrays.asList(12,23,54,54,46,45,64,53,43,54);
        System.out.println(list2);
        // Comparator<Integer> com=new Comparator<>() {
        //     public int compare(Integer a,Integer b){
        //         if(a%10<b%10){
        //             return -1;
        //         }
        //         else if(a%10>b%10){
        //             return 1;
        //         }
        //         else{
        //             return  0;
        //         }
        //     }
        // };

        

        Collections.sort(list2,(a2,b2)->a2%10>b2%10?-1:1);
        System.out.println("sorted with 2 digit"+list2);
        
    }

}
