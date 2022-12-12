public class Ebook extends Book {
    
    private String fileName;

    public String getFileName(){
        return fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public Ebook(String title,String author, String fileName){
        super(title,author);
        this.fileName = fileName;
    }


}
