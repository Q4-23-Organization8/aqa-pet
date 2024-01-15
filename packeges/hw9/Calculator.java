package hw9;

public class Calculator {
    public static double sumCalculation(double number1, double number2)

    {
        return number1 + number2;
    }

    public static double subtractCalculation(double number1, double number2)

    {
        return number1 - number2;
    }

    public static double multiplyCalculation(double number1, double number2)

    {
        return number1 * number2;
    }

    public static double divideCalculatio(double number1, double number2)

    {
        if (number2 != 0) {
            return number1 / number2;
        } else

        {
            System.out.println("Error");
            return Double.NaN;
        }
    }
}