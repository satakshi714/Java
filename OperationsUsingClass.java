import java.util.*;
class MathOperations{
    int a;
    int b;
    public int multiply(int a, int b){
        return a*b;
    }
};
public class OperationsUsingClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        MathOperations op = new MathOperations();
        int res  = op.multiply(a,b);
        System.out.println("Product: "+ res);
    }
}