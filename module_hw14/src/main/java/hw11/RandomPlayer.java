package hw11;
import java.util.Random;
class RandomPlayer extends Player {
    private Random random = new Random();

    @Override
    protected Move makeMove() {
        return Move.values()[random.nextInt(Move.values().length)];
    }
}

