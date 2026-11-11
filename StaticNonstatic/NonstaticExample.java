package StaticNonstatic;


class Student{
    int id = 1;
    String name = "pavi";
    int marks = 100;
    String subject = "Java";
    static String clg_name = "VTU";

    void Details(){
        System.out.println("Student details are : ");
        System.out.println("Id = : "+id);
        System.out.println("Name =  : "+name);
        System.out.println("Marks =: "+marks);
        System.out.println("Subject: "+subject);

    }

    void showclg(){
        System.out.println("Collage name = "+clg_name);
    }
}
public class NonstaticExample {

    public static void main(String[] args){
        Student s = new Student();
        s.Details();
        s.showclg();
    }

}
