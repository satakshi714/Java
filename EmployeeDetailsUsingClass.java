import java.util.*;
class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
};
public class EmployeeDetailsUsingClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        Employee obj1 = new Employee(name,salary);
        Employee obj2 = new Employee("Sara", 53748);
        Employee obj3 = new Employee("Gia",56780);
        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }
}
