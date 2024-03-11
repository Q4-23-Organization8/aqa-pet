package hw11;

public abstract class Player {
    protected abstract Move makeMove() throws IllegalArgumentException;
}

enum Move {
    ROCK, PAPER, SCISSORS
}
