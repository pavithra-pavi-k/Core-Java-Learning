package PraticeExamples;

class Parking{
    String Vehiclenumber;
//constructor
    public Parking(String Vehiclenumber){
        this.Vehiclenumber = Vehiclenumber;
    }
//MethodOverloading
    void Calculatecharge(){
        System.out.println("Vehicle :"+ Vehiclenumber);
    }

    void Calculatecharge(int hours){
        System.out.println("Parking Duration "+hours +"hours");
    }

    void Calculatecharge(int hours,int days){
        System.out.println("Hours:"+hours);
        System.out.println("Days :"+days);
    }
}

//child class1
class CarParking extends Parking{
    CarParking(String Vehiclenumber){
        super(Vehiclenumber);//call the parent class
    }

    @Override 
        void Calculatecharge(){
            System.out.println("Car parking  charge is 100Rs");
        }            
}
//chlid class2
class BikeParking extends Parking{
    BikeParking(String Vehiclenumber){
        super(Vehiclenumber);//call the parent class
    }

    @Override 
        void Calculatecharge(){
            System.out.println("Bike parking  charge is 50Rs");
        }            
}

//child class3
class TruckParking extends Parking{
    TruckParking(String Vehiclenumber){
        super(Vehiclenumber);//call the parent class
    }

    @Override 
        void Calculatecharge(){
            System.out.println("Truck parking  charge is 200Rs");
        }            
}
public class SmartParkingSystem {
    public static void main(String[] args) {
        
        CarParking c = new CarParking("KA01");
        BikeParking b = new BikeParking("KA02");
        TruckParking t = new TruckParking("KA03");

        System.out.println("Smart Parking System");

        System.out.println("\n Vehicle Number : "+ c.Vehiclenumber);
        c.Calculatecharge();
        c.Calculatecharge(5);

        System.out.println("\n Vehicle Number : "+ b.Vehiclenumber);
        b.Calculatecharge();

        System.out.println("\n Vehicle Number : "+ t.Vehiclenumber);
        t.Calculatecharge();

        System.out.println("\n Vehicle Number : "+ c.Vehiclenumber);//overloading example
        c.Calculatecharge(2,1);
    }

}
