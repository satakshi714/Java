class Student2{
    String name;
    static String school;

    public static void changeschool(){
        school = "newschool";
    }
}

public class StaticKeyword {
    public static void main(){
        Student2.school = "JMV";
        Student2 st = new Student2();
        st.name = "tony";
        System.out.println(st.school);
    }
}
