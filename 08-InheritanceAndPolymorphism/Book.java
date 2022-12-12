public class Book {
    
    private String title;
    private String author;

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String display(){
        String toString = "";
        toString += "Title: " + title + "\nAuthor: " + author;
        return toString;
    }
}
