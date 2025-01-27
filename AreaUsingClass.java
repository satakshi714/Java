import java.util.*;
class Rectangle{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    int area(){
        return this.length*this.width;
    }
};

public class AreaUsingClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(); 
        int width = sc.nextInt();
        Rectangle ar = new Rectangle(length,width);
        int res = ar.area();
        System.out.println(res);
    }
}