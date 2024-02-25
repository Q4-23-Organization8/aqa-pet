package hw13;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("John", "Smith", 20));
        users.add(new User("Alice", "Johnson", 25));
        users.add(new User("Bob", "Jones", 18));
        users.add(new User("Sarah", "Adams", 30));
        users.add(new User("Michael", "Scott", 22));
        users.add(new User("Emily", "Simpson", 17));
        users.add(new User("David", "Miller", 29));
        users.add(new User("Jessica", "Anderson", 35));
        users.add(new User("Ryan", "Stewart", 19));
        users.add(new User("Laura", "Williams", 21));


        List<User> sortedByAge = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by age:");
        sortedByAge.forEach(System.out::println);
        System.out.println();

        double averageAge = users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
        System.out.println("Average age: " + averageAge);
        System.out.println();

        List<User> sortedByFirstNameAndAge = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getAge))
                .collect(Collectors.toList());
        System.out.println("Sorted by first name and age:");
        sortedByFirstNameAndAge.forEach(System.out::println);
        System.out.println();

        boolean startsWithSOrA = users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
        System.out.println("Users with last name starting with 'S' or 'A': " + startsWithSOrA);
        System.out.println();

        boolean allOver18 = users.stream()
                .allMatch(user -> user.getAge() > 18);
        System.out.println("All users are over 18: " + allOver18);
        System.out.println();
    }
}
