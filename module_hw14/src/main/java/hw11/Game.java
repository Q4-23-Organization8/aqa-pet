package hw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Game {
    private static final Logger logger = LoggerFactory.getLogger(Game.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player1();
        Player player2 = new RandomPlayer();

        while (true) {
            Move player1Move = null;

            try {
                player1Move = player1.makeMove();
            } catch (IllegalArgumentException e) {
                logger.error("Error: {}", e.getMessage());
                continue;
            }

            Move player2Move = player2.makeMove();

            logger.info("Player2 chose: {}", player2Move);

            determineWinner(player1Move, player2Move);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                logger.info("Exiting the game.");
                break;
            }
        }

        scanner.close();
    }

    private static void determineWinner(Move userMove, Move computerMove) {
        if (userMove == computerMove) {
            logger.info("It's a draw!");
        } else if ((userMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                (userMove == Move.PAPER && computerMove == Move.ROCK) ||
                (userMove == Move.SCISSORS && computerMove == Move.PAPER)) {
            logger.info("You win!");
        } else {
            logger.info("Player2 wins!");
        }
    }
}
