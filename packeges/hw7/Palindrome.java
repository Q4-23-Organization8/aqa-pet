package hw7;
import java.util.Arrays;
public class Palindrome {
        public static void main(String[] args) {
            String word = "шалаш";
            char[] charArray = word.toCharArray();
            char reverseArray [] = new char [charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                reverseArray[i] = charArray[charArray.length - 1 - i];}

            System.out.println ((Arrays.equals(charArray,reverseArray) ? "Palindrome" : "Not palindrome"));

        }}
