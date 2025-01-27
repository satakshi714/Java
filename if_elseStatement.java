import java.util.*;

class if_elseStatement{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = Integer.parseInt(a.nextLine());
        if(age > 18){
            System.out.println("Person is adult");
        }else{
            System.out.println("Person in not an adult");
        }
    }
}