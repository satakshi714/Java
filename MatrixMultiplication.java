import java.util.*;
public class MatrixMultiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        if(n2 == m1){
            int[][] arr1 = new int[n1][n2];
            int[][] arr2 = new int[m1][m2];

            System.out.println("Input for array 1");
            for(int i = 0; i < n1; i++){
                for(int j = 0; j < n2; j++){
                    arr1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Input for array 2");
            for(int i = 0; i < m1; i++){
                for(int j = 0; j < m2; j++){
                    arr2[i][j] = sc.nextInt();
                }
            }
            int[][] res = new int[n1][m2];
            for(int i = 0; i < res.length; i++){
                for(int j = 0; j < res[0].length; j++){
                    for(int k = 0; k < res[0].length; k++){
                        res[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            System.out.println("Product: ");
            for(int i = 0; i < res.length; i++){
                for(int j = 0; j < res[0].length; j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Matrix multiplication not possible");
        }

    }
}