import java.util.*;

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low]; 
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) { 
                j--;
            }
            if (i < j) { 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; 
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1); 
        for (int num : arr) {
            System.out.print(num + " ");
        }

        
    }
}
