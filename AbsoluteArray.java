import java.util.*;
import java.lang.Math;

public class AbsoluteArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }   
        // brute force
        for(int i = 0; i < n; i++){
            int sum=0;
            for(int j = 0; j < n; j++){
                sum = sum + Math.abs(arr[i]-arr[j]);
            }
            res[i] = sum;
        }
        System.out.println(res[n]);
    }
}