import java.util.*;
public class FibonacciSeriesInLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, next;

        for(int i = 1; i <= n; i++){
            System.out.println(a);
            next = a + b;
            a = b;
            b = next;
        }
    }
}