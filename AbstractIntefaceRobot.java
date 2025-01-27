abstract class Machine{
    abstract void turnOn();
}
interface Opeateable{
    void operate();
}

class Robot extends Machine implements Opeateable{
    void turnOn(){
        System.out.println("Robot is on");
    }
    public void operate(){
        System.out.println("Robot can operate");
    }
}
public class AbstractIntefaceRobot{
    public static void main(String[] args){
        Robot r = new Robot();
        r.turnOn();
        r.operate();
    }
}