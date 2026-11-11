package PraticeExamples;

class SmartDevice{
    String devicename;

    SmartDevice(String devicename){
        this.devicename = devicename;
    }

    void turnOn(){
        System.out.println(devicename +" is ON");
    }

    void control(int level){
        System.out.println("Level "+level);
    }

    void control(int temp,String mode){
        System.out.println("Temperature : "+temp);
        System.out.println("Mode :"+mode);
    }
}

class smartLight extends SmartDevice{
    smartLight(String devicename){
        super(devicename);
    }
        @Override
        void turnOn(){
            System.out.println("SmartLight is ON");
    }
}

class SmartFan extends SmartDevice{
    SmartFan(String devicename){
        super(devicename);
    }

    @Override
    void turnOn(){
        System.out.println("Smart fan is on");
    }
}


class SmartAC extends SmartDevice{
    SmartAC(String devicename){
        super(devicename);
    }
    @Override
    void turnOn(){
        System.out.println("Smart AC is on");
    }

}
public class SmartHomeAutomation {


    public static void main(String[] args) {

       
        
        SmartFan f = new SmartFan("rexo");

        SmartAC ac = new SmartAC("inverter");

        smartLight l = new smartLight("LED");

        f.turnOn();
        l.turnOn();

       

}
}