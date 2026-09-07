class Author {
    private String name;
    private String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}
class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Правильный сеттер для года публикации
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
public class Main {
    public static void main(String[] args) {
        // Создаём авторов
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Николай", "Гоголь");

        // Создаём книги: title, author, year (int, без кавычек!)
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Ревизор", author2, 1835);

        System.out.println("До изменения:");
        printBookInfo(book1);
        printBookInfo(book2);

        // ИЗМЕНЕНИЕ ГОДА ПУБЛИКАЦИИ ЧЕРЕЗ СЕТТЕР
        book1.setPublicationYear(1870);

        System.out.println("После изменения года у первой книги:");
        printBookInfo(book1);
    }

    private static void printBookInfo(Book book) {
        System.out.println("Название: " + book.getTitle());
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurName());
        System.out.println("Год публикации: " + book.getPublicationYear());
        System.out.println();

    }
}