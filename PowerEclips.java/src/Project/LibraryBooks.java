package Project;

public class LibraryBooks {
       
       private String bookName;
       private int bookNumber;
       private String author;
       private String bookType;
       
       
       public String getBbookName() {
           return bookName;
           
       }
       public int getBookNumber()
       {
           return bookNumber;
       }
       public String getAuthor() {
           return author;
           
       }
       public String getBbooktype() {
           return bookType;
           
       }
            
       
       LibraryBooks(){}

       LibraryBooks(String bookName, int bookNumber,String author, String bookType){
           this.bookName = bookName;
           this.bookNumber = bookNumber;
           this.author = author;
           this.bookType = bookType;
       }
       
       
       public void DiplayBooks() {
           System.out.println(bookName);
           System.out.println(bookNumber);
           System.out.println(author);
           System.out.println(bookType);
       }
}
