package Unit_5.BlackJack;

import java.util.ArrayList;

public class Dealer extends Player {
    public int response() {
        System.out.println(this.highestScore());
        int res = (this.highestScore() > 17) ? 2 : 1;
        if(this.highestScore() == -5)res = 2;
        this.setHitOrStanding(res);
        return res;
    }
    public String toString(){
        String ret = "Dealer Has:\n";
        ArrayList<Card> cards = this.getCards();
        ret+=cards.get(0);
        for (int i = 1; i <= cards.size() - 1; i++) {
            ret+=", " + cards.get(i);
        }
        return ret;
    }
}
