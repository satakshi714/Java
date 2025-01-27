abstract class Shapes1{
    abstract double area();
}
class Circle1 extends Shapes1{
    double radius;
    Circle1(double radius){
        this.radius = radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}
class Rectangle1 extends Shapes1{
    double length;
    double width;
    Rectangle1(double length, double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length*width;
    }
}
class Triangle1 extends Shapes1{
    double base, height;
    Triangle1(double base, double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return 0.5*base*height;
    }
}

public class PolymorphismArea{
    public static void main(String[] args){
        Shapes1 c = new Circle1(7);
        Shapes1 r = new Rectangle1(4,5);
        Shapes1 t = new Triangle1(3,4);

        System.out.println(c.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}