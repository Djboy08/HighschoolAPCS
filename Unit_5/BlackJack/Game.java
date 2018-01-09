package Unit_5.BlackJack;

import java.util.ArrayList;

public class Game {
    Deck deck;
    public Game() {
        deck = new Deck();
    }
    public void start(){
        ArrayList<Card> c = deck.getDeck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        int Round = 1;
        while (player.getCash() > 0) {
            //Starting round
            for (int i = 1; i <= 2; i++) {
                player.giveCard(deck.getRandomCard());
                dealer.giveCard(deck.getRandomCard());
            }
            player.setHitOrStanding(1);
            dealer.setHitOrStanding(1);
            System.out.println("TEST");
            System.out.println("Round: "+Round++);
            while(player.getHitOrStanding() != 2 || dealer.getHitOrStanding() != 2) {
                System.out.println(player);
                System.out.println(dealer);
                if(deck.getDeck().size() <= 5){
                    deck = new Deck();
                }
                if(player.getHitOrStanding() == 1) {
                    System.out.println(player.response());
                }
                if(dealer.getHitOrStanding() == 1) {
                    System.out.println(dealer.response());
                }
                if(player.getHitOrStanding() == 1){
                    player.giveCard(deck.getRandomCard());
                }
                if(dealer.getHitOrStanding() == 1){
                    dealer.giveCard(deck.getRandomCard());
                }
            }


        }
    }

}
