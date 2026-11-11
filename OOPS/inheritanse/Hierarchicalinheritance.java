package OOPS.inheritanse;


class Employee{
    int id ;
    String name ;
    int sal;

    void displaydetails(){
        System.out.println("Show Details....");

    }


    void calsal(){
        System.out.println("calculate the salary");
    }
}

class dev extends Employee{
    String lang = "Java";
    void dispDetails(){
        super.displaydetails();
        System.out.println("Java Developer");
    }

}

class testing extends Employee{
    String lang ="Java Sal";
    void display(){
        System.out.println("testing Team");
    }
}
public class Hierarchicalinheritance {

    public static void main(String[] args) {

        dev d = new dev();
        System.out.println(d.lang);
        d.dispDetails();

        testing t = new testing();
        System.out.println(t.lang);
        t.display();
        

    }

}
