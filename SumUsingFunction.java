import java.util.*;
public class SumUsingFunction{

    public static int printSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = printSum(a,b);
        System.out.println(res);
    }
}