package hw6;
import java.util.Scanner;
public class PrintMonthInWordViaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        String result;
        switch (month) {
            case 1:
                result = "JAN";
                break;
            case 2:
                result = "FEB";
                break;
            case 3:
                result = "MAR";
                break;
            case 4:
                result = "APR";
                break;
            case 5:
                result = "MAY";
                break;
            case 6:
                result = "JUN";
                break;
            case 7:
                result = "JUL";
                break;
            case 8:
                result = "AUG";
                break;
            case 9:
                result = "SEP";
                break;
            case 10:
                result = "OCT";
                break;
            case 11:
                result = "NOW";
                break;
            case 12:
                result = "DEC";
                break;
            default:
                result = "Not a valid month";
                break;
        }
            System.out.println(result);
            scanner.close();
        }
    }
