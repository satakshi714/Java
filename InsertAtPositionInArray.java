import java.util.*;
public class InsertAtPositionInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int ele = sc.nextInt();
        for(int i = index; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[index] = ele;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}