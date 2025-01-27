import java.util.*;

class doWhileloops{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        int i = 0;

        do{
            System.out.println(i);
            i=i+1;
        }
        while(i < num);
    }
}