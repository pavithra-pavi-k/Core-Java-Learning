package CollectionFrameworkDemo;
import java.util.ArrayList;

public class ArrayListdemo {
    public static void main(String[] args) {
       ArrayList<String> s = new ArrayList<String>();

        s.add("Pavi");
        s.add("Mahee");
        s.add("bhagya");
        s.add("Ravi");

        System.out.println("Students : "+s);

        //get() - access element
        System.out.println(s.get(0));
        

        //set() - update
        s.set(3,"priya");
        System.out.println("After updating : "+s);

        //remove
        s.remove("Ravi");
        System.out.println(s);

        System.out.println(s.size());
    }

}
