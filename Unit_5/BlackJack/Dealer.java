package Unit_5.BlackJack;

public class Dealer extends Player {
    public int response() {
        return highestScore() > 17 ? 2 : 1;
    }
}
