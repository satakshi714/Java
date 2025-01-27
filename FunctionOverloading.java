class Student1{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    
}


public class FunctionOverloading {
    public static void main(String args[]){
        Student1 s1= new Student1();
        s1.name = "Aman";
        s1.age = 21;
        s1.printinfo(s1.age);
    }
}


//polymorphism - many ways to do a task-
//function overloading (compile time polymorphism)-  functions with same name but different tasks
//rules-
//each functin should have different return type or different type of parameters of different number of parameters


//function overriding(runtime polymorphism)-