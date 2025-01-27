import java.util.*;
public class DiscountChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double amt = sc.nextDouble();
        double dis=0;
        if(amt > 5000){
            dis = amt * 0.20;
        }else if(amt > 2000 && amt < 5000){
            dis = amt * 0.10;
        }else{
            System.out.println("No available discount");
        }
        System.out.println("Final Amount: "+(amt-dis));
    }
}