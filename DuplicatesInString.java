import java.util.*;
public class DuplicatesInString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(res.indexOf(String.valueOf(ch)) == -1){
                res.append(ch);
            }
        }
        System.out.println(res.toString());
    }
}