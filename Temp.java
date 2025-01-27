import java.util.*;
public class Temp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature in fahrenhiet: ");
        double t = sc.nextDouble();
        double inC = ((t-32)*(5.0/9.0));
        System.out.println("Temprature in Celcius is: "+ String.format("%.2f",inC));
        sc.close();
    }
}