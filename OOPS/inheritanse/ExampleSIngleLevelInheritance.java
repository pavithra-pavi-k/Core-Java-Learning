package OOPS.inheritanse;


class Employee{
    int empid = 1;
    String name = "pavi";
    float salary = 50000;

    void displayEmployeDeatlis(){
        System.out.println("Employee Id :"+empid);
        System.out.println("Employee name :"+name);
        System.out.println("Employee salary :"+salary);
    }
    void Calculatesalary(){
        System.out.println("over all salary : "+salary*2);
    }

}

class Developer extends  Employee{
    String programlang = "JAVA";
    
    void displaydeveloperdetails(){
        displayEmployeDeatlis();

    }
}
public class ExampleSIngleLevelInheritance {

    public static void main(String[] args) {
        Developer d = new Developer();
        d.displaydeveloperdetails();
        System.out.println("Programmimg language :" +d.programlang);

        d.Calculatesalary();
    }

}
