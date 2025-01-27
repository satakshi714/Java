import java.util.*;
public class PalindromeUsingMethod{
    public static String checkPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        if(rev.equals(s)){
            return "Is Palindrome";
        }else{
            return "Not Palindrome";
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st = checkPalindrome(s);
        System.out.println(st);
        
    }
}