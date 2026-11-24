package CollectionFrameworkDemo.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetTreeset {

    public static void main(String[] args) {
        

         Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);
        set.add(null);

        System.out.println(set);


         Set<Integer> set2 = new TreeSet<>();

        set2.add(21);
        set2.add(35);
        set2.add(45);
        set2.add(789);
        set2.add(99);

        System.out.println(set2);
    
    
    
    }


}
