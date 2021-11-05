package ua.privatbank.ilina.hw5;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return title + " (" + author + ", " + year + " г.)";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


//    Класс Book хранит такую информацию о книге:
//        - название
//        - автор книги
//        - год издания
//
//        Класс Reader хранит такую информацию о пользователе библиотеки:
//        - ФИО
//        - номер читательского билета
//        - факультет
//        - дата рождения
//        - телефон
//        Типы полей выбирать на свое усмотрение.
//
//        Имеет перегруженные методы takeBook(), returnBook():
//
//        - takeBook, который будет принимать количество взятых книг.
//        Выводит на консоль сообщение
//        "Петров В. В. взял 3 книги".
//
//
//        - takeBook, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//
//        - takeBook, который будет принимать переменное количество объектов класса Book.
//        Выводит на консоль сообщение
//        "Петров В. В. взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
//
//        Аналогичным образом перегрузить метод returnBook().
//        Должно быть 3 метода returnBook() которые выводит на консоль сообщения:
//        - "Петров В. В. вернул 3 книги"
//        - "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//        - "Петров В. В. вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)".
//
//        Класс Library используется как демонстрация работы классов Book и Reader.
//        Имеет метод main() в котором создается массивы объектов Book и Reader, по 3 или более элементов в каждом.
//        Выполняются такие действия:
//        - печатаются все книги.
//        - печатаются все читатели.
//        - демонстрируется работа всех вариантов методов takeBook() и returnBook().