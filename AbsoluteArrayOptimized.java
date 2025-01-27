import java.util.*;

public class AbsoluteArrayOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        int pr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            pr[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            int leftSum = (i != 0 ? (arr[i] * i - pr[i-1]) : 0);
            int rightSum = sum -pr[i] - (n-i-1) * arr[i] ;
            res[i] =  leftSum + rightSum;
        }
        
        for (int i = 0; i <n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
