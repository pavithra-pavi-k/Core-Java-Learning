package Examples;

import OOPS.Abstraction.Abstractkeyword.main;

class Person{
    String name;
    int age;


    void display(String name ,int age){
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

    Employee(String name , int age){
        super(name,age);

        this.empId=empId;
        this.salary = salary;
    }

}
public class EmployeeManagementSystem {

    public static void main(String[] args) {
        
        Person p = new Person("Pavi",21);
    }

}
