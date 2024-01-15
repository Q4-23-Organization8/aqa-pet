package hw9;

    class EngineerCalculator extends Calculator {
        public static double squareRoot(double x) {
            if (x >= 0) {
                return Math.sqrt(x);
            } else {
                System.out.println("Cannot calculate square root of a negative number!");
                return Double.NaN;
            }
        }
    }
