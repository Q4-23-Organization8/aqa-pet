package hw6;
import java.util.Scanner;
public class LineLength {
    public static void main(String[] args) {
        /*Дано рядки різної довжини (довжина - парне число), необхідно повернути її два середні знаки.
        Наприклад, якщо даний рядок "Hillel" результат буде "ll", для рядка "Java" результат "av", для "Hometask" результат "et".*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть слово: ");
        String word = scanner.nextLine();
        int wordLenght = word.length();
        System.out.print(word.charAt(wordLenght /2 - 1) + "" + word.charAt(wordLenght / 2));
        scanner.close();
    }
}
