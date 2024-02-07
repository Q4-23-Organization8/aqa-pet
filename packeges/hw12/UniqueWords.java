package hw12;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueWords {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "Dog", "Cat", "pig", "lion", "horse", "panda", "cattle", "panda", "panda");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            int frequency = wordFrequency.getOrDefault(word, 0);
            wordFrequency.put(word, frequency + 1);
        }

        System.out.println("The list of words and its frequencies (not including register):");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
