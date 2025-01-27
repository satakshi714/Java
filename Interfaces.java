interface Animals{
    void walks();   //only defined
}

inteface Herbivore{

}

class Horses implements Animals, Herbivore {
    public void walk(){            //implementation
        System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String args[]){
        Horses horse = new Horses();
        horse.walk();
    }
}

//interfaces cannot have constructors
//no non-abstract function 
//all the fields are public static and final by default
//all the methods are public and abstract by default
//a class that implemnets an interface must implement all the methods declared in the interface
//interfaces support the functionality of multiple inheritance
