package OOPS.inheritanse;

class  vehicle{
    void start(){
        System.out.println("vehicle start");
    }
    void show(){
        System.out.println("show deatlis of car");
    }
    void stop(){
        System.out.println("vehicle stop");
    }
}

class car extends vehicle{
    int doors = 4;
    void fuleType(){
        System.out.println("need some power to start car");

}
}


class EVcar extends car{
  int batterycap = 600;

  @Override
  void fuleType() {
      // TODO Auto-generated method stub
      super.fuleType();
      System.out.println("Need battery to start car");
  }
}

public class MultiLevelinheritance {
    public static void main(String[] args) {


        //vehcile class
        EVcar e = new EVcar();
        e.start();
        e.stop();
        //car class
        e.fuleType();
        System.out.println("No.of doors : "+e.doors);

        //evcar class
        System.out.println("battery capacity : "+e.batterycap);
        e.fuleType();
        
    }

}


