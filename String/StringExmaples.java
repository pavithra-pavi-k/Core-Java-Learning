package String;



class Employee{
    int id ;
    String name;

    Employee(int id,String name){
        this.id = id;
        this.name=name;
    }

     public String toString(){
         return "hello";
     }

    public int hashcode(){
        return  123;
    }
}
public class StringExmaples {

    public static void main(String[] args) {
        
        Employee e = new Employee(1, "Pavi");
        System.out.println(e);
        System.out.println(e.toString());

        System.out.println(e.hashCode());
    }
}
