package Array;


class Employe{
    int id;
    String name ;

    Employe(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return " Id = "+id+"\n "+"Name = "+name;
    }


}
public class ArrayOfObject {
    public static void main(String[] args) {

        Employe arr[] = {new Employe(01, "pavi"),new Employe(02, "sindhu")};
        System.out.println(arr[0].id);//tp avoid this kind we use tostring methode instead of call everytime like.id and .name 
        System.out.println(arr[1]);
        System.out.println(arr[0]);
    }

}
