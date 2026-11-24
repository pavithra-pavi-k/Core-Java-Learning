package CollectionFrameworkDemo;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Product{

    String name ;
    int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display(){

        System.out.println("Name : "+ name + " "+ "Price : "+price);
    }

}

class Productname implements  Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }

}

class Productprice implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        // TODO Auto-generated method stub
        return Integer.compare(o1.price, o2.price);
    }

    
}
public class Comparatordemo {


    public static void main(String[] args) {
        
        List<Product> al = new ArrayList<>();

        al.add(new Product("Laptop ",500000));
        al.add(new Product("keyboard ",1500));
        al.add(new Product("Bag ",1000));
        al.add(new Product("Monitor",20000));

         //sort by name 
         Collections.sort(al,new Productprice());
         System.out.println("Sorted by price :");
         
         for (Product p :al){
            //System.out.println(p);
            p.display();
         }


         //sort by price

         Collections.sort(al,new Productname());
         System.out.println("Sorted by name : ");
         for (Product p :al){
            p.display();
         }



        


    }
}
