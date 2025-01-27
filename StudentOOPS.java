class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student( String name, int age){
        this.name = name;
        this.age = age;
    }
}


public class StudentOOPS {
    public static void main(String args[]){
        Student s1= new Student("Shraddha", 22);
        // s1.name = "Aman";
        // s1.age = 21;
        s1.printinfo();
    }
}

//types of constructors in java-
//parameterized-parameters
//non-parameterized-no parameters in function

// properties of cunstructor
// cunstructor shave the same name as class
// they do not return a value
// they dont have any return type evan void as well
//can be called when object is created
//bydefault is claways createed by java

//we don't write destructors in java because jaav has a garbage collector and desturctor is called everytime the cunstructor is called