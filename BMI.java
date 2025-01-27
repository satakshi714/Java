import java.util.*;
public class BMI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight(in kg): ");
        double w = sc.nextDouble();
        System.out.println("Enter height (in m): ");
        double h = sc.nextDouble();

        double res = w/(h*h);
        if(res < 18.5)
            System.out.println("Category: Underweight");
        else if(res > 18.5 && res < 24.9)
            System.out.println("Category: Normal");
        else if( res > 24.9 && res < 29.9)
            System.out.println("Category: Overweight");
        else    
            System.out.println("Category: Obese");
    }
}