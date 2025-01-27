import java.util.*;

public class ReverseStringNormalProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        while(n>0){
            String s = sc.nextLine();
            stringBuilder.reverse();
            String rev = stringBuilder.toString();
            System.out.println(stringBuilder);
        }
    }
}