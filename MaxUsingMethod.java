import java.util.*;
public class MaxUsingMethod{
    public static int maxElement(int a, int b){
        return (a>b ? a : b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = maxElement(a,b);
        System.out.println(res);
    }
}