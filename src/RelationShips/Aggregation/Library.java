package RelationShips.Aggregation;

import java.util.ArrayList;
import java.util.List;

class Book{
    private String Name;
    private String Author;
    Book(String Name,String Author){
        this.Name=Name;
        this.Author=Author;
    }
    public String getName(){
        return Name;
    }
}
public class Library {
    private List<Book> books= new ArrayList<>();
    Library(List<Book> books){
        this.books=books;
    }
    public void showBooks(){
        for(Book book: books ){
            System.out.println(book.getName());
        }
    }
}
