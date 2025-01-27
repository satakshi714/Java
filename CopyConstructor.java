class Students{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Students( Students s2){    //copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
    Students(){

    }
}


public class CopyConstructor {
    public static void main(String args[]){
        Students s1= new Students();
        s1.name = "Aman";
        s1.age = 21;

        Students s2 = new Students(s1);
        s1.printinfo();
    }
}
