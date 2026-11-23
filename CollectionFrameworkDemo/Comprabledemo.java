package CollectionFrameworkDemo;
import java.util.ArrayList;
import java .util.Collections;

class Student implements Comparable<Student>{

    int id;
    String name;
    int marks;

    public Student(int id, String name,int marks) {

        super();
        this.id = id;
        this.name = name;
        this.marks = marks;

    }
     @Override 
     public int compareTo(Student o ){
        return this.marks -o.marks;
     }


    @Override
    public String toString() {
        return "Student [id =" + id + ", name = " + name + ", marks = "+ marks + " ]";
    }
    

    // @Override 
    // public int compareTo(Student o){
    //     return this.name.compareTo(o.name);
    // }

}


public class Comprabledemo {

    public static void main(String[] args) {

        ArrayList<Student> s = new ArrayList<Student>();
        
        s.add(new Student(101, "Pavi", 89));
        s.add(new Student(103, "mahee", 70));
        s.add(new Student(104, "sindhu", 95));
        s.add(new Student(102, "Akshi", 65));

        Collections.sort(s);
        System.out.println("After sorting by name : ");

        for (Student g:s){
            System.out.println(g);
        }
    }

}
