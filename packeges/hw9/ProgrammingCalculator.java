package hw9;

    class ProgrammingCalculator extends Calculator {
        public static int binaryToDecimal(String binaryNumber) {
            if (binaryNumber.matches("[01]+")) {
                return Integer.parseInt(binaryNumber, 2);
            } else {
                System.out.println("Invalid binary number format.");
                return 0;
            }
        }
    }

