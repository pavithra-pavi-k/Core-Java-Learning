package Examples;

import OOPS.Abstraction.Abstractkeyword.main;

class Person{
    String name;
    int age;


    Person(String name ,int age){
        this.name = name ;
        this.age = age;

    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }
    void displayPerson(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

}

class Employee extends Person{
    int empId;
    double salary;

    Employee(String name , int age,int empId,double salary){
        super(name,age);

        this.empId=empId;
        this.salary = salary;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }

    public int getempId(){
        return empId;
    
    }

    public double gesalary(){
        return salary;

    }


    void displayEmployee(){
        displayPerson();

        System.out.println("Employe id : "+empId);
        System.out.println("Salary : "+salary);
    }
}

class developer extends Employee{
    String lang = "Java";


    developer(String name, int age , int empId,double salary,String lang){
        super(name,age,empId,salary);
        this.lang = lang;
    }

    void writecode(){
        System.out.println("Programming language : "+lang);
    }
}
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        
    developer d = new developer("pavi",22 ,101, 1000000, "Java");
    
    // d.displayPerson();

    System.out.println("----Employee details----");
    d.displayEmployee();

    System.out.println("----Developer details-----");
    d.writecode();

    }

}
