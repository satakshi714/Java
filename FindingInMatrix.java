import java.util.*;
public class FindingInMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean found= false;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == target){
                    System.out.println("Element found at position: ["+ (i+1) +"] ["+ (j+1)+"]");
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}