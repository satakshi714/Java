import java.util.*;
class Vehicles{
    String make;
    int speed;

    Vehicles(String make, int speed){
        this.make = make;
        this.speed = speed;
    }
    void displayDetails(){
        System.out.println("Make: "+ make +" Speed: "+ speed);
    }
}
class Car extends Vehicles{
    int doors;
    Car(String make, int speed, int doors){
        super(make, speed);
        this.doors = doors;
    }
    void displayDetails(){
        System.out.println("Make: "+ make +" Speed: "+ speed+" Doors: "+doors);
    }
}
public class VehiclesInheritance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String make = sc.nextLine();
        int speed = sc.nextInt();
        int doors = sc.nextInt();

        Vehicles v = new Vehicles(make,speed);
        Car c = new Car(make,speed,doors);

        v.displayDetails();
        c.displayDetails();
    }
}