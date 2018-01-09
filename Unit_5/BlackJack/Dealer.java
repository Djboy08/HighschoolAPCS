package Unit_5.BlackJack;

        import java.util.ArrayList;

public class Dealer extends Player { //I extend the player to gain all the methods from them.
    public int response() { // I override this method because this is a computer and does not take user input.
        int res = (this.highestScore() > 17) ? 2 : 1;
        if(this.highestScore() == -5)res = 2;
        this.setHitOrStanding(res);
        return res;
    }
    public String toString(){ //I also override the toString method due to the starting word Dealer or Player changes.
        String ret = "Dealer Has:\n";
        ArrayList<Card> cards = this.getCards();
        ret+="Hidden Card";
        for (int i = 1; i <= cards.size() - 1; i++) {
            ret+=", " + cards.get(i);
        }
        return ret;
    }
}
