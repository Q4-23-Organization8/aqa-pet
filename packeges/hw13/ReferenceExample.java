package hw13;

public class ReferenceExample {
    public static void printMessage() {
        System.out.println("Printing...");
    }
    public static void main(String[] args) {
        Printable printable = ReferenceExample::printMessage;

        printable.print();
    }
}

