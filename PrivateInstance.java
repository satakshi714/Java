import java.util.*;
class Student3{
    private String name;
    private int rollNo;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
};

public class PrivateInstance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollNo = sc.nextInt();

        Student3 st = new Student3();
        st.setName(name);
        st.setRollNo(rollNo);
        System.out.println("Name: "+name+" Roll No.: "+rollNo);
    }
}