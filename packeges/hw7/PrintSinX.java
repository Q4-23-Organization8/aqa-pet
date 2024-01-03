package hw7;

import java.util.Arrays;
public class PrintSinX {
        public static void main(String[] args) {
            double[] sinValues = new double[37];
            for (int i = 0; i < 37; i++) {
                int angle = i * 10;
                double sinValue = Math.sin(angle);
                sinValues[i] = sinValue;
            }
            System.out.println(Arrays.toString(sinValues));
        }
    }