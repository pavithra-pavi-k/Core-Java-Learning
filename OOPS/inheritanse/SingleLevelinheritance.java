package OOPS.inheritanse;


class vehicle{
    void start(){
        System.out.println("Vehicle will be start");
    }

    void show(){
        System.out.println("Show the detalis of car vehicle");
    }

    void stop(){
        System.out.println("vehicle stop");
    }
}

class BMWcar extends vehicle{
    @Override
    void start() {
        // TODO Auto-generated method stub
        super.start();
        System.out.println("Can play music and open roofs of the car");
    }

}
public class SingleLevelinheritance {

    public static void main(String[] args) {
        
        BMWcar  b = new BMWcar();
        b.start();
        b.show();
        b.stop();

    }

}
