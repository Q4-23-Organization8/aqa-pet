package hw12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class DeleteDuplicates {
    public static void main(String[] args) {

        List<Integer> originalList = generateRandomList(100, -20, 20);

        List<Integer> copyList = new ArrayList<>(originalList);

        Set<Integer> uniqueSet = new HashSet<>(originalList);
        originalList.clear();
        originalList.addAll(uniqueSet);

        System.out.println("Original List: " + copyList);
        System.out.println("List without duplicates: " + originalList);

        int removedDuplicatesCount = copyList.size() - originalList.size();
        System.out.println("Number of removed duplicates: " + removedDuplicatesCount);
    }
    private static List<Integer> generateRandomList(int size, int min, int max) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt((max - min) + 1) + min);
        }

        return randomList;
    }
}
