import java.util.*;
public class NumberProperties{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res;
        if(a % 2 == 0){
            res = "even";
        }else
            res = "odd";
        
        if(a > 0)
            System.out.println("Positive and "+res);
        else if(a < 0)
            System.out.println("Negative and "+ res);
        else
            System.out.println("Zero");
        sc.close();
    }
}