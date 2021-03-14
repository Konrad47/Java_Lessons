package akademia;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Russel", "Winderand");
        Book book = new Book("Developing Java Software",author,79.75);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());

    }
}
