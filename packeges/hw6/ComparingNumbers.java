package hw6;

import java.util.Scanner;
    import java.util.Scanner;
public class ComparingNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the 1st number: ");
            double number1 = scanner.nextDouble();
            System.out.print("Enter the 2nd number: ");
            double number2 = scanner.nextDouble();
            double result = (Math.abs(number1) > Math.abs(number2) ? number1 : number2);
            System.out.println("Більше абсолютне значення має число: " + result);
            scanner.close();
        }
}
