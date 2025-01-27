abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal Eats");
    }
    Animal(){
        System.out.println("You are creating a new animal");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
    Horse(){
        System.out.println("You are creating a Horse");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        // Animal animal = new Animal()
        // horse.walk();
        //will give error because animal object cannot be created because Animal class is an abstract concept(run time error)
    }
}

//must be declared with abstract keyword
//can have abstact and non-abstract method
//can not be instantiated(initiated) - object cannot be created
//can have constructors and static methods also
//
