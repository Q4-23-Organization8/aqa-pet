package hw13;

public class LambdaExpression {
        public static void main(String[] args) {

            Printable printable = () -> System.out.println("Printing...");

            printable.print();
        }
}

