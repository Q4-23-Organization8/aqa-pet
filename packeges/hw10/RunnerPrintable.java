package hw10;

import static hw10.Magazine.printMagazines;

public class RunnerPrintable {
    public static void main(String[] args) {
        Printable[] library = new Printable[7];

        library[0] = new Book("Harry Potter and the Prisoner of Azkaban");
        library[1] = new Magazine("The Forbes");
        library[2] = new Book("Robinson Crusoe");
        library[3] = new Book("Harry Potter and the Philosopher's Stone");
        library[4] = new Magazine("Playboy");
        library[5] = new Book("Harry Potter and the Chamber of Secret");
        library[6] = new Book("Harry Potter and the Goblet of Fire");

        for (Printable printable : library) {
            printable.print();
        }

        System.out.println("--------------------");

        Magazine.printMagazines(library);

        System.out.println("--------------------");

        Book.printBooks(library);

    }
}
