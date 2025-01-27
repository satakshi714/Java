import java.util.*;

public class SumofElements{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        // int arr[] = new int[n];

        for(int i = 0; i <= n;i++){
            sum+= i;
        }
        System.out.println(sum);
    }
}