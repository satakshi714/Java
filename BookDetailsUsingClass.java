import java.util.*;
class Books{
    String title;
    String author;
    Books(String title, String author){
        this.title = title;
        this.author = author;
    }
    void displayDetails(){
        System.out.println("Title: "+ title +" Author: "+author);
    }
};
public class BookDetailsUsingClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        Books mybook = new Books(title,author);
        mybook.displayDetails();
    }
}
