import java.util.*;
public class TrafficLightSimulator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String col = sc.nextLine().toLowerCase();

        switch(col){
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("WAIT");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("Invalid color");
        }
    }
}