package hw10;

public class Magazine implements Printable {

    private String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println("Print Magazine: " + magazineName);
    }

    public void printName() {
        System.out.println(magazineName);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                ((Magazine) printable).printName();
            }
    }
    }
}
