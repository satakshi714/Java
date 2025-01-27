import java.util.Scanner;

class Animal1 {
    String name;  // Store the Animal1's name

    Animal1(String name) {
        this.name = name;
    }

    void move() {
        System.out.println("The Animal1s are moving");
    }
}

class Bird extends Animal1 {
    Bird(String name) {
        super(name);  // Call the parent class constructor
    }

    void move() {
        System.out.println(name + " is flying");
    }
}

class Fish extends Animal1 {
    Fish(String name) {
        super(name);
    }

    void move() {
        System.out.println(name + " is swimming");
    }
}

class Mammal extends Animal1 {
    Mammal(String name) {
        super(name);
    }

    void move() {
        System.out.println(name + " is walking");
    }
}

public class AnimalMethodOverriding{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the bird: ");
        String bird = sc.nextLine();
        System.out.print("Enter the name of the fish: ");
        String fish = sc.nextLine();
        System.out.print("Enter the name of the mammal: ");
        String mammal = sc.nextLine();

        Animal1 b = new Bird(bird);
        Animal1 f = new Fish(fish);
        Animal1 m = new Mammal(mammal);

        b.move();
        f.move();
        m.move();
    }
}
