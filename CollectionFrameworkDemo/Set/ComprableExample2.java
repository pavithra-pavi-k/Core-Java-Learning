package CollectionFrameworkDemo.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int age;
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Employee a){
        if(this.name.length()>a.name.length()){
            return 1;
        }
        return -1;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    } 
}



public class ComprableExample2 {

    public static void main(String[] args) {

         List<Employee> list=new ArrayList<>();
        list.add(new Employee(1, "Rohit", 18));
        list.add(new Employee(5, "Kartik", 23));
        list.add(new Employee(6, "Maheen", 27));
        list.add(new Employee(7, "Raj", 20));

        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(1);


        Collections.sort(list);
        // System.out.println(list);

        for (Employee val : list) {
            System.out.println(val);
        }
        
    }


}
