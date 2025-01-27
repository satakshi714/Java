import java.util.*;
public class PalindromeString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = new StringBuilder(s).reverse().toString();

        if(s.equals(rev)){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}