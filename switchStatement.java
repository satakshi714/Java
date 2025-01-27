import java.util.*;

class switchStatement{
    public static void main(String[] args){
        Scanner i= new Scanner(System.in);
        int button = i.nextInt();

        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }
    }
}