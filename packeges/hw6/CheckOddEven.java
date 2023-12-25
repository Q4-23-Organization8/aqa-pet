package hw6;

import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {
        /* 1.Написати програму "CheckOddEven" яка друкує "Odd number", якщо змінна непарна, або "Even number", якщо парна.
        Перед завершенням роботи програма має друкувати "BYE".
        Значення змінної можна задати вручну через Scanner або присвоїти початкове значення в коді */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println(number%2 > 0 ? "Odd number" : "Even number");
        System.out.println("BYE");
        scanner.close();
    }
}
