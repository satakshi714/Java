import java.util.*;

class logicalOperators{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = a.nextInt();
        System.out.println("Enter num2: ");
        int num2 = b.nextInt();
        if(num1 == num2){
            System.out.println("Equal");
        }else if(num1 > num2){
                System.out.println("num1 is greater than num2");
        }else{
                System.out.println("num2 is greater than num1");
            
        }
    }
}