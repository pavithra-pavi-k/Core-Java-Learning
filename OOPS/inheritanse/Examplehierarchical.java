package OOPS.inheritanse;


class Animal{

    void sound(){
        System.out.println("animals ahas some sound");
    }

}

class dog extends  Animal{
    void sound(){
        System.out.println("bow bow");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println("meow meow");
    }
}

class cow extends Animal{
    void sound(){
        System.out.println(" amm BOO");
    }
}

class monkey extends Animal{
    void sound(){
        System.out.println("some sound");
    }
}
public class Examplehierarchical {
    public static void sound(Animal a){
        a.sound();
    }
    public static void main(String[] args) {
        //cat c = new cat();

        sound(new cat());
        sound(new dog());
        sound(new cow());
        sound(new monkey());
    }

}
