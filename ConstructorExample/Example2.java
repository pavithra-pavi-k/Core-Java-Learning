package ConstructorExample;



class Student{
    String name ;
    int age ;

    Student(){
        System.out.println("Student Details");
    }

    Student(int age ,String name){
        System.out.println(" age = "+age +" \n name = " +name);

    }
}

public class Example2 {

    public static void main(String [] args){
        Example2 s = new Example2();
        System.out.println(s);// show the address of the s ;
        Student s1 = new Student(22,"pavi");
        System.out.println(s1);
        
    }

}
