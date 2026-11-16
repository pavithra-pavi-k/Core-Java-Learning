package String;

public class StringExmaple2 {

    public static void main(String[] args) {
        
        //string:
        /*
        heap:
        1.constant pool area
        2.non-constant pool area 
      */
     

        //1.way of creating string
        String name= "abc";
        System.out.println(name);

        //2.way creating string
        String name2 = new String("abc");
        System.out.println(name2);


        String name3 = new String("abc");
        System.out.println(name3);

        System.out.println(name == name2);
        System.out.println(name2==name3);//checks address

        System.out.println(name.equals(name3));//checks the values
        System.out.println(name2.equals(name));
    }

}
