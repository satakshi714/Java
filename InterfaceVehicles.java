interface Vehicles1{
    void startEngine();
    void stopEngine();
}
class Car1 implements Vehicles1{
    public void startEngine(){
        System.out.println("Car Engine Started");
    }
    public void stopEngine(){
        System.out.println("Car Engine Stopped");
    }
}
class Bike implements Vehicles1{
    public void startEngine(){
        System.out.println("Bike Engine Started");
    }
    public void stopEngine(){
        System.out.println("Bike Engine Stopped");
    }
}

public class InterfaceVehicles{
    public static void main(String[] args){
        Vehicles1 c = new Car1();
        Vehicles1 b = new Bike();

        c.startEngine();
        c.stopEngine();
        b.startEngine();
        b.stopEngine();
    }
}