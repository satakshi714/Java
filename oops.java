class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);

    }
    public void printtype(){
        System.out.println(this.type);
    }
}


public class oops{
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printcolor();
        pen1.printtype();

        pen2.printcolor();
        pen2.printtype();

    }
}



