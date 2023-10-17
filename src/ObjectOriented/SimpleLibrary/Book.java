package ObjectOriented.SimpleLibrary;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int number_of_pages;

    // initalizing the constructor

    public Book(String title, String author,String isbn,int number_of_pages){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.number_of_pages=number_of_pages;
    }

    // Getter methods
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getNumber_of_pages(){
        return number_of_pages;
    }


    public void displayDetails(){
        System.out.println("TITLE OF THE BOOK :-" + title);
        System.out.println("AUTHOR OF BOOK :-" + author);
        System.out.println("ISBN OF THE BOOK :-" + isbn);
        System.out.println("NUMBER OF PAGES OF THE BOOK" + number_of_pages);
        System.out.println();
    }
}
