package hw10;

public class Book implements Printable {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Print Book: " + bookName);
    }

    public void printName() {
        System.out.println(bookName);
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                ((Book) printable).printName();
            }
        }
    }
}
