package Lab4.P1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  ArrayList <BookStore> bookStore = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    String booksearch;

    public static void main(String[] args) {

        BookStore bookStore = new BookStore();


//        bookStore.addBook(new Book());
//        bookStore.addBook(new Book("ww","ssw","ww",2,3,2));
//        bookStore.addBook(new Book("swss","ss","ww",2,3,2));
//
//
//        for(Book book: bookStore.searchBookAuthor("ss")){
//            System.out.println(book);
//        }
        int choise = 0;

        System.out.println("introduceti o carte");
        while (choise != 3) {
            System.out.println("1: Add Book");
            System.out.println("2: List Books");
            System.out.println("3: Remove Book");
            System.out.println("4: Find by Title");
            choise = scanner.nextInt();

            switch (choise) {
                case 1: //add a book
//             System.out.println("enter book ");

                    System.out.println("enter id ");
                    int id = scanner.nextInt();

//             System.out.println("enter title ");
//             String title = scanner.nextLine();
                    System.out.println("enter title ");
                    String title = scanner.next();

                    System.out.println("enter author ");
                    String author = scanner.next();

                    System.out.println("enter publisher ");
                    String publisher = scanner.next();

                    System.out.println("nr page cpunt  ");
                    int pageCount = scanner.nextInt();

                    System.out.println("ne of copiii ");
                    int nrOfCopies = scanner.nextInt();

                    System.out.println("nr price ");
                    int price = scanner.nextInt();

                    bookStore.addBook(new Book(id, title, author, publisher, pageCount, nrOfCopies, price));
                    break;
                case 2:
                    System.out.println("list books");
                    bookStore.printBook();
                    break;
                case 3:
                    System.out.println("remove a book");
                    System.out.println("id");
                    int id2 = scanner.nextInt();
//                    bookStore.removeBook(id2);
                    break;
                case 4:
                    System.out.println("find by title");
//                    booksearch=scanner.next();
//                    bookStore.searchBookAuthor(booksearch);

                    break;
            }
        }

    }
    public boolean search() {
        String booksearch = scanner.next();
        for (int i = 0; i < bookStore.size(); i++) {
            if (bookStore.equals(booksearch)) {

            }
        }
        return true;
    }

}
