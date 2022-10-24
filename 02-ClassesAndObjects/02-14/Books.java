public class Books {
    //Atrybuty

    String BookName;
    String PublicationDate;
    String Author;
    double avgRating;
    
    //Zachowania
    public void bookInfo(){
        System.out.println("Tytuł: " + BookName);
        System.out.println("Rok wydania: " + PublicationDate);
        System.out.println("Autor: " + Author);
        System.out.println("Ocena: " + avgRating);
    }
    public static void main(String[] args){
        Books b1 = new Books();
        b1.BookName = "Hobbit";
        b1.PublicationDate = "2012";
        b1.Author = "J.K.Rowling";
        b1.avgRating = 4.5;
        b1.bookInfo();
    }
}
