import java.util.*;
public class PasswordStrengthChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        int len = pass.length();

        boolean isCh = false;
        boolean isDig = false;

        for(char ch: pass.toCharArray()){
            if(Character.isLetter(ch)){
                isCh = true;
            }
            if(Character.isDigit(ch)){
                isDig = true;
            }
        }

        if(len < 6){
            System.out.println("Weak Password");
        }else if(len > 6 && len <= 10 && isDig){
            System.out.println("Moderate Password");
        }else if(len > 10 && isCh && isDig){
            System.out.println("Strong Password");
        }else{
            System.out.println("Password Strength Cannot be determined");
        }
    }
}