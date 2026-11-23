package CollectionFrameworkDemo;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        
        Vector<Integer> v = new Vector<Integer>();

         v.add(1);
         v.add(2);
         v.add(3);
          v.add(4);

          for (int h:v){
            System.out.println(h);
          }

         // v.clear();
          System.out.println(v);

          v.clear();//removes all data present in list and gives empty list
    }

}
