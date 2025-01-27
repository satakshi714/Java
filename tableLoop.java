import java.util.*;

public class tableLoop {
    public static void main(String[] agrs){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
