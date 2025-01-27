import java.util.*;

public class SelectionSort{
    public static void selection_sort(int arr[], int n){
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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
        selection_sort(arr,n);
    }
}