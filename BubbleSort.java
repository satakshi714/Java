import java.util.*;

public class BubbleSort{
    public static void bubble_sort(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubble_sort(arr,n);
    }
}