import java.util.*;
class Book{
    String title;
    String author;
    Book(){
        title = "Song Of Solomon";
        author = "Toni Morrison";
    }
    void displayDetails(){
        System.out.println("Titlt: "+ title +" Author: "+author);
    }
};
public static void main(String[] args){
    Book mybook = new Book();
    mybook.displayDetails();

}
