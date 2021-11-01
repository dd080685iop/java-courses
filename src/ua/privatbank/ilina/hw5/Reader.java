package ua.privatbank.ilina.hw5;

import java.util.Arrays;

public class Reader {
    private String fio;
    private int ticketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;


    public Reader() {
    }

    public Reader(String fio, int ticketNumber, String faculty, String dateOfBirth, String phone) {
        this.fio = fio;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int booksCount) {
        System.out.println(fio + " взял " + booksCount + " книг(и)");
    }

    public void takeBook(String[] books) {
        System.out.println(fio + " взял книг(у,и): " + Arrays.toString(books));
    }

    public void takeBook(Book[] books) {
        System.out.println(fio + " взял книг(у,и): " + Arrays.toString(books));
    }

    public void returnBook(int booksCount) {
        System.out.println(fio + " вернул " + booksCount + " книг(и)");
    }

    public void returnBook(String[] books) {
        System.out.println(fio + " вернул книг(у,и): " + Arrays.toString(books));
    }

    public void returnBook(Book[] books) {
        System.out.println(fio + " вернул книг(у,и): " + Arrays.toString(books));
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFakultet() {
        return faculty;
    }

    public void setFakultet(String fakultet) {
        this.faculty = fakultet;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return fio + " " + ticketNumber + " " + faculty + " " + dateOfBirth + " " + phone;
    }
}


