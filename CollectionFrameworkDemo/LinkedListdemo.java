package CollectionFrameworkDemo;
import java.util.LinkedList;

public class LinkedListdemo {
    public static void main(String[] args) {
        
        java.util.LinkedList<Integer> p =new java.util.LinkedList<Integer>();

        p.add(2);
        p.add(3);
        p.add(4);
        p.add(5);

        //add first = addFirst()
        p.addFirst(8);

        //addLast()
       // p.addLast("Priya");//Complie time error 

        p.addLast(89);
        p.addLast(56);

        System.out.println("Number : "+p);

        System.out.println("After removing first = "+p.removeFirst());

        System.out.println(p);
    
    
    }

}
