import java.util.*;
public class SumOfDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        while(a!=0){
            sum += a%10;
            a /= 10;
        }
        System.out.println("Sum is: "+sum);
        sc.close();
    }
}