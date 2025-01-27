import java.util.*;
class TempratureConversion{
    double temp;
    public static double celciusToFahrenheit(double temp){
        return (temp * 9.0/5.0) + 32;
    }
};

public class StaticMethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        double te = TempratureConversion.celciusToFahrenheit(t);
        System.out.println(te);

    }
}