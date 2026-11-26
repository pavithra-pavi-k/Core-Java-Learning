package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodReferenceExample {

    public static void main(String[] args) {
        

        List<String> names = Arrays.asList("Raju","John","Akshi","Mahee","Pavi");

        Optional<String> name = names.stream().filter(str->str.contains("Akshi")).findFirst();
        //System.out.println(name.get());
        System.out.println(name.orElse("No value present"));
        

        List<String> name2 = names.stream().map(str->str.toUpperCase()).toList();
        System.out.println(name2);

        List<String> name3 = names.stream().map(String::toLowerCase).toList();
        System.out.println(name3);


        List<String> name4 = names.stream().filter(str->str.contains("P")).map(String::toLowerCase).toList();
        System.out.println(name4);
        

        
    }

}
