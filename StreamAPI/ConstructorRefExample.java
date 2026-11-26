package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class Employee{
    int id ;
    String name ;
    

    Employee(){

    }

    Employee( String name) {
        
        this.name = name;
        
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
    


    
}

public class ConstructorRefExample {

    public static void main(String[] args) {
        
        List<Employee> emplist = new ArrayList<>();
        List<String> names = Arrays.asList("Raju","John","Akshi","Mahee","Pavi");

        for(String string : names){
            emplist.add(new Employee(string));
        }

        System.out.println(emplist);



        System.out.println("\n Try with Stream Map");

        List<Employee> emplist2 = new ArrayList<>();
        emplist2 = names.stream().map(name ->new Employee(name)).toList();
        System.out.println(emplist2);
        

        
        System.out.println("\n Constructor Reference ");
        List<Employee> emplist3 = new ArrayList<>();
        emplist3 = names.stream().map(Employee::new).toList();
        System.out.println(emplist3);
        

    }

}
