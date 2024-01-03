package hw7;

public class MinMaxInArray {
    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 3, 4, 50, 3, -100, 99};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 8; i++) {
            if (intArray[i] < min)

                min = intArray[i];
        }
        System.out.println("Min value in array is: " + min);
        for (int i = 0; i < 8; i++) {
            if (intArray[i] > max)

                max = intArray[i];
        }
        System.out.println("Max value in array is: " + max);
    }
}
