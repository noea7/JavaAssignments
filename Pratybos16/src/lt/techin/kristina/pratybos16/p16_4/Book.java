package lt.techin.kristina.pratybos16.p16_4;

import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private long codeISBN;
    private int year;
    private String genre;
    private boolean isTaken = false;
    private Reader currentReader;
    private LocalDate dateTaken;
    private LocalDate dateDue;
    private boolean isReserved = false;
    private Reader reservedReader;

    public Book(String name, String author, long codeISBN, int year, String genre) {
        this.name = name;
        this.author = author;
        this.codeISBN = codeISBN;
        this.year = year;
        this.genre = genre;
        Library.addBook(this);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Long getCodeISBN() {
        return codeISBN;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public void reserveBook (Reader reader) {
        if (isReserved) {
            System.out.println("Book already reserved");
        } else {
            isReserved = true;
            reservedReader = reader;
            Library.addReservation(this);
            System.out.println("Book successfully reserved");
        }
    }

    public void cancelReservation () {
        if (!isReserved) {
            System.out.println("Book is not reserved");
        } else {
            isReserved = false;
            reservedReader = null;
            Library.removeReservation(this);
            System.out.println("Reservation cancelled");
        }
    }

    public void takeBook(Reader reader, LocalDate dateTaken) {
        if (isTaken) {
            System.out.println("Book already taken");
        } else {
            if (isReserved) {
                if (reservedReader.equals(reader)) {
                    cancelReservation();
                    isTaken = true;
                    currentReader = reader;
                    this.dateTaken = dateTaken;
                    dateDue = dateTaken.plusDays(14);
                    Library.addBookContract(this);
                    System.out.println("Book successfully taken");
                }
                else {
                    System.out.println("Book is reserved for another reader");
                }
            } else {
                isTaken = true;
                currentReader = reader;
                this.dateTaken = dateTaken;
                dateDue = dateTaken.plusDays(14);
                Library.addBookContract(this);
                System.out.println("Book successfully taken");
            }
        }
    }
    public void takeBook(Reader reader) {
        takeBook(reader, LocalDate.now());
    }
    public void returnBook() {
        if (isTaken) {
            isTaken = false;
            currentReader = null;
            dateTaken = null;
            dateDue = null;
            Library.removeBookContract(this);
            System.out.println("Book successfully returned");
        }
    }

    public LocalDate getDateDue() {
        return dateDue;
    }

    public Reader getCurrentReader() {
        return currentReader;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", codeISBN='" + codeISBN + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
