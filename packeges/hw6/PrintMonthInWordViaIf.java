package hw6;

import java.util.Scanner;
public class PrintMonthInWordViaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        String result;
        if (month == 1)
            result = "JAN";
        else if (month == 2)
            result = "FEB";
        else if (month == 3)
            result = "MARCH";
        else if (month == 4)
            result = "APR";
        else if (month == 5)
            result = "MAY";
        else if (month == 6)
            result = "JUN";
        else if (month == 7)
            result = "JUL";
        else if (month == 8)
            result = "AUG";
        else if (month == 9)
            result = "SEP";
        else if (month == 10)
            result = "OCT";
        else if (month == 11)
            result = "NOW";
        else if (month == 12)
            result = "DEC";
        else result = "Not a valid month";
        System.out.println(result);
        scanner.close();
    }
}
