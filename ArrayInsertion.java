import java.util.*;
public class ArrayInsertion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int val = sc.nextInt();
        int newArr[] = new int[n+1];

        for(int i = 0; i < index; i++){
            newArr[i] = arr[i];
        }
        newArr[index] = val;
        for(int i = index; i < n; i++){
            newArr[i+1] = arr[i];
        }
        for(int i : newArr){
            System.out.print( i+" ");
        }
    }
}