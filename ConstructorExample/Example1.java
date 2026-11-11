package ConstructorExample;


// 2 construtor 1.parameterized  2.non parameterized


class Employee{
    int id = 1;
    String name = "pavi";


Employee(){
    System.out.println("Hello COnstructor");
}

Employee(int id,String name){
    // String b = name;
    this .name = name;
    this.id = id;
    System.out.println("id is : "+id);
    System.out.println("name is : "+name);
}
}

public class Example1 {

    public static void main(){

        new Employee();
        new Employee(1,"PAVITHRA");

    }

}
