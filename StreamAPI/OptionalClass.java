package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import OOPS.Abstraction.Abstractkeyword.main;

public class OptionalClass {

    public static void main(String[] args) {
        

        List<String> names = Arrays.asList("Raju","John","Akshi","Mahee","Pavi");

        Optional<String> name = names.stream().filter(str->str.contains("Akshi")).findFirst();
        //System.out.println(name.get());
        System.out.println(name.orElse("No value present"));
        

        String name2 = names.stream().filter(str->str.contains("Akshi")).findFirst().orElse(null +" or No value");
        System.out.println(name2);
    }

}
