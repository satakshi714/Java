import java.util.*;
abstract class Shape2{
    abstract double calculateArea();
}
class Circle extends Shape2{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape2{
    double l;
    double w;
    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }
    double calculateArea(){
        return l*w;
    }
}

public class AbstractClassArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Shape2 c = new Circle(r);;
        Shape2 rec = new Rectangle(l,w);
        System.out.println(c.calculateArea());
        System.out.println(rec.calculateArea());
    }
}