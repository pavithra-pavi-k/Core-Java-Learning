package StaticNonstatic;


/*
static - static 
*/



public class StaticNonstaticAcsess {

    int a = 10;
    static int b = 20;

    public static void add(){
        System.out.println(b);
    }

    public void sum(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main (String[] args){

        add();
       /*StaticNonstaticAcsess s = new StaticNonstaticAcsess();
        s.sum();
        */

        new StaticNonstaticAcsess().sum();

    }
}
