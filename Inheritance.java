class Shapes{
    public void area(){
        System.out.println("display area:");
    }
}
class Triangle extends Shapes{       //single level inheritance   //hierarchial inheritance
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shapes{         //hierarchial inheritance
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

class EquilateralTriangle extends Triangle{    //multi level inheritance
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}


public class Inheritance {
    public static void main(String args[]){

        Triangle t1 = new Triangle();
        t1.area();
        t1.area(3,4);
    }
    
}
//types of inheritance
//single level
//multilevel
//hierarchial
//hybrid