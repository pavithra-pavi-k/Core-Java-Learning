package OOPS.Abstraction.Coupling;
/*

tight coupling
loose coupling = component are independent
 */
//tight coupling means component depends on other intenal details    ....like car class depends on the vehicle class to run the void run method so any changes made in the vehicle class it reflects in the car class 
class Vehicle{
    void run(){
        System.out.println("runs on petrol");
    }
}

class Car{
    void run(){
        Vehicle v = new Vehicle();
        v.run();
    }
}
public class Main {
    public static void main(String[] args) {
        
        Car c = new Car();
        c.run();
    }

}
