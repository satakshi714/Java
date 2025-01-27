import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        int result;
        switch(op){
            case '+':
                result = a+b;
                break;
            case '-':
                result = (a>b ? a-b : b-a);
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                if(b!=0){
                    result = a/b;
                }else{
                    System.out.println("Can't divide when denominator is zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(a + op + b + "  = " + result);
    }
}