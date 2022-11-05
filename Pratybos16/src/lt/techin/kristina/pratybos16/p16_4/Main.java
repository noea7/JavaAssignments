package lt.techin.kristina.pratybos16.p16_4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Jonas Jonaitis", LocalDate.of(1992,01,10));
        System.out.println(reader1.getDateOfBirth());
        Book book1 = new Book("Žiedų valdovas. Žiedo brolija","John Ronald Reuel Tolkien",9786090142509L, 2020,"Fantasy");
        System.out.println(Library.getBooks());
        book1.reserveBook(reader1);
        book1.takeBook(reader1);
        System.out.println(book1.getDateDue());
        Book book2 = new Book("Žiedų valdovas. Dvi tvirtovės. 2 dalis","John Ronald Reuel Tolkien",9786090142523L,2020,"Fantasy");
        book2.takeBook(reader1,LocalDate.of(2022,10,01));
        System.out.println(book2.getDateDue());
        Library.getOverdueBooks();
        System.out.println(Library.getBooksByReader(reader1));
        book1.returnBook();
        System.out.println(Library.getBooksByReader(reader1));
        Reader reader2 = new Reader("Jone Jonyte", LocalDate.of(1989,07,27));
        book2.takeBook(reader2);
        book2.reserveBook(reader2);
        book1.reserveBook(reader2);
        book1.takeBook(reader1);
        book1.takeBook(reader2);
        System.out.println(Library.getBooksByReader(reader2));
    }
}
