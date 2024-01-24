package hw11;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player Player1 = new Player1();
        Player Player2 = new RandomPlayer();

        while (true) {
            Move Player1Move = null;

            try {
                Player1Move = Player1.makeMove();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                continue;
            }

            Move Player2Move = Player2.makeMove();

            System.out.println("Player2 chose: " + Player2Move);

            determineWinner(Player1Move, Player2Move);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Exiting the game.");
                break;
            }
        }

        scanner.close();
    }

    private static void determineWinner(Move userMove, Move computerMove) {
        if (userMove == computerMove) {
            System.out.println("It's a draw!");
        } else if ((userMove == Move.ROCK && computerMove == Move.SCISSORS) ||
        (userMove == Move.PAPER && computerMove == Move.ROCK) ||
        (userMove == Move.SCISSORS && computerMove == Move.PAPER)) {
            System.out.println("You win!");
        } else {
            System.out.println("Player2 wins!");
        }
    }
}
