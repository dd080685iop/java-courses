package ua.privatbank.ilina.hw5;

import java.util.Arrays;

public class Library {

    public static void main(String[] args) {
        Book[] books = {
                new Book("Moydodir", "some author", 1973),
                new Book("Cheburashka", "some author", 1985),
                new Book("Tom&Jery", "some author", 1941),
        };
        Reader[] readers = {
                new Reader("John Dou1", 1234, "faculty1",
                        "05.12.1995", "+2423234234"),
                new Reader("John Dou2", 345234, "faculty2",
                        "03.02.2005", "+242334234"),
                new Reader("John Dou3", 897765, "faculty3",
                        "85.32.9995", "+4567865"),
        };

        System.out.println("\n\n");

        System.out.println(Arrays.toString(books));
        System.out.println(Arrays.toString(readers));

        System.out.println("\n\n");
        readers[0].takeBook(books);
        readers[1].takeBook(5);
        readers[2].takeBook(new String[]{"Moydodir", "Cheburashka", "Tom&Jery"});


        System.out.println("\n\n");
        readers[0].returnBook(books);
        readers[1].returnBook(5);
        readers[2].returnBook(new String[]{"Moydodir", "Cheburashka", "Tom&Jery"});


    }
}


//    Класс Library используется как демонстрация работы классов Book и Reader.
//        Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
//        Выполняются такие действия:
//        - печатаются все книги.
//        - печатаются все читатели.
//        - демонстрируется работа всех вариантов методов takeBook() и returnBook().