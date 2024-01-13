package hw9;

import static hw9.Calculator.sumCalculation;
import static hw9.Calculator.subtractCalculation;
import static hw9.Calculator.multiplyCalculation;
import static hw9.Calculator.divideCalculatio;
import static hw9.EngineerCalculator.squareRoot;
import static hw9.ProgrammingCalculator.binaryToDecimal;



public class CalculatorRunner {
    public static void main(String[] args) {

        double resultSum = sumCalculation(7.5, 6.2);
        double resultSubtract = subtractCalculation(7.5, 6.2);
        double resultMultiply = multiplyCalculation(7.5, 6.2);
        double resultDivide = divideCalculatio(7.5, 6.2);
        double resultSquareRoot = squareRoot(9);
        int resultBinary = binaryToDecimal(String.valueOf(10));

        System.out.println("Sum: " + (String.format("%.2f",resultSum)));
        System.out.println("Subtraction: " + (String.format("%.2f",resultSubtract)));
        System.out.println("Multiplication: " + (String.format("%.2f",resultMultiply)));
        System.out.println("Division: " + (String.format("%.2f",resultDivide)));
        System.out.println("Square root: " + (resultSquareRoot));
        System.out.println("Binary: " + (resultBinary));
    }
}

