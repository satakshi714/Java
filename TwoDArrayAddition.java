import java.util.*;
public class TwoDArrayAddition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        System.out.println("Input for array 1");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input for array 2");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Output: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}