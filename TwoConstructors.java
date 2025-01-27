import java.util.*;
class Person{
    String name;
    int age;
    Person(){
        this.name = "Unknown";
        this.age = 0;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayDetails(){
        System.out.println("Name: "+ name+" Age: "+ age);
    }
};
public class TwoConstructors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Person p1 = new Person(name,age);
        Person p2 = new Person();

        p1.displayDetails();
        p2.displayDetails();
    }
}