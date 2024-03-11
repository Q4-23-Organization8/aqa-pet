package hw11;

import java.util.Scanner;

public class Player1 extends Player {
    @Override
    protected Move makeMove() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your move: rock, paper or scissors");

        try {
            String userInput = scanner.nextLine().toLowerCase();

            if (!isValidMove(userInput)) {
                throw new IllegalArgumentException("Wrong choice. Please choose Rock, Paper, or Scissors.");
            }

            return Move.valueOf(userInput.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

            return makeMove();
        }
    }

    private boolean isValidMove(String userInput) {
        return userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors");
    }
}


