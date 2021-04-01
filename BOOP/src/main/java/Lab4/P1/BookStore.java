package Lab4.P1;


import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private ArrayList<Book>book ;
    private int countBook = 0;

    public BookStore() {
        this.book = new ArrayList<Book>();
//        this.countBook = countBook;
    }

    public void addBook(Book newBook){
        this.book.add(newBook);
    }

    public boolean removeBook(Book book){

        return this.book.remove(book);
    }


//    public Book searchBook(){
//
//        for(Book book : bookStore) {
//            if (book.getTitle().contains(booksearch)) {
//                return book;
//            }
//        }
//        return null;
//    }

//    public ArrayList<Book> searchBookPrice(int price){
////        ArrayList<Book> foundBook = new ArrayList<Book>();
//        for(int i=0; i<this.book.size();i++){
//            if (this.book.get(i).getPrice()==price){
//                book.add(this.book.get(i));
//            }
//        }
//        return book;
//    }



    public void printBook(){
        for(Book b: book){
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchBookPrice(int price){
      ArrayList<Book> foundBook = new ArrayList<Book>();
        for(int i=0; i<this.book.size();i++){
            if (this.book.get(i).getPrice()==price){
                book.add(this.book.get(i));
            }
        }
        return book;
    }

    public ArrayList<Book> searchBookAuthor(String author){
      ArrayList<Book> foundBook= new ArrayList<Book>();
        for(int i=0; i<this.book.size();i++){
            if(this.book.get(i).getAuthor() == author){
                foundBook.add(this.book.get(i));
            }
        }
        return foundBook;
    }
    //
//   public int findBookTitle(String title){
//        for(int i=0; i<books.length;i++){
//            if(books[i].getTitle() == title){
//                return 1;
//            }
//        }
//        return -1;
//   }
}
