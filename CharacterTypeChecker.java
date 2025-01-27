import java.util.*;
public class CharacterTypeChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(Character.isDigit(ch)){
            System.out.println("It's a digit");
        }else if(Character.isLetter(ch)){
            if("AEIOUaeiou".indexOf(ch)!=-1){
                System.out.println("It's a vowel");
            }else{
                System.out.println("It's a consonant");
            }
        }else{
            System.out.println("It's a special character");
        }
    }
}