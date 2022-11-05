package lt.techin.kristina.pratybos16.p16_4;

import java.time.LocalDate;
import java.util.*;

public class Library {
    private static List<Book> books = new ArrayList<>();
    private static List<Reader> readers = new ArrayList<>();
    private static List<Book> bookContracts = new LinkedList<>();
    private static List<Book> bookReservations = new LinkedList<>();

    public static void addReader(Reader reader) {
        readers.add(reader);
    }
    public static void addBook(Book book) {
        books.add(book);
    }

    public static void addReservation(Book book) {
        bookReservations.add(book);
    }
    public static void removeReservation(Book book) {
        bookReservations.remove(book);
    }
    public static void addBookContract(Book book) {
        bookContracts.add(book);
    }
    public static void removeBookContract(Book book) {
        bookContracts.remove(book);
    }

    public static List<Book> getBooks() {
        return books;
    }
    public static List<Book> getOverdueBooks() {
        List<Book> overdueBooks = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for(Book takenBook : bookContracts) {
            if (takenBook.getDateDue().isBefore(currentDate)) {
                overdueBooks.add(takenBook);
                System.out.println("Book " + takenBook.getName() + ", author " + takenBook.getAuthor()
                + " is overdue, due date was: " + takenBook.getDateDue() + ". Reader " + takenBook.getCurrentReader().getFullName());
            }
        }
        return overdueBooks;
    }
    public static List<Book> getBooksByReader(Reader reader) {
        List<Book> readerBooks = new ArrayList<>();
        for(Book takenBook : bookContracts) {
            if (takenBook.getCurrentReader().equals(reader)) {
                readerBooks.add(takenBook);
            }
        }
        return readerBooks;
    }
}
