package hw7;
import java.util.Arrays;

public class ChangeEvenNumbers {
    public static void main(String[] args)
    {
        int[] intArray = new int[] { 1, 2, 3, 4, 50, 3, 100, 99};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0)
                intArray[i] = 0;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
