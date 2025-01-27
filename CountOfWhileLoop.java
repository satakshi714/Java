import java.util.*;

public class CountOfWhileLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n>0){
            n=n/2;
            count++;
        }
        System.out.println(count);
    }
}

// time complexity - log base(2) N