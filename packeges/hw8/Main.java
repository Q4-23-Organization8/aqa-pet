package hw8;

import static hw8.Calculator.sumCalculation;
import static hw8.Calculator.subtractCalculation;
import static hw8.Calculator.multiplyCalculation;
import static hw8.Calculator.divideCalculatio;


public class Main {
    public static void main(String[] args) {

        double resultSum = sumCalculation(7.5, 6.2);
        double resultSubtract = subtractCalculation(7.5, 6.2);
        double resultMultiply = multiplyCalculation(7.5, 6.2);
        double resultDivide = divideCalculatio(7.5, 6.2);

        System.out.println("Sum: " + (String.format("%.2f",resultSum)));
        System.out.println("Subtraction: " + (String.format("%.2f",resultSubtract)));
        System.out.println("Multiplication: " + (String.format("%.2f",resultMultiply)));
        System.out.println("Division: " + (String.format("%.2f",resultDivide)));
    }
}