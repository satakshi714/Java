import java.util.*;

class checkOddEven{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = n.nextInt();
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}