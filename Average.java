import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no. of inputs: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            sum += a;
        }
        int avg = sum/n;
        System.out.println("Average is: "+ avg);
    }
}