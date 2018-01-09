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
            player.reset();
            dealer.reset();
            for (int i = 1; i <= 2; i++) {
                player.giveCard(deck.getRandomCard());
                dealer.giveCard(deck.getRandomCard());
            }
            player.setHitOrStanding(1);
            dealer.setHitOrStanding(1);
            System.out.println("\n\nRound: "+Round++);
            while(player.getHitOrStanding() != 2 || dealer.getHitOrStanding() != 2) {
                System.out.println(player);
                System.out.println(dealer);
                if(deck.getDeck().size() <= 5){
                    deck = new Deck();
                }
                if(player.getHitOrStanding() == 1) {
                    player.response();
                }
                if(dealer.getHitOrStanding() == 1) {
                    dealer.response();
                }
                if(player.getHitOrStanding() == 1){
                    player.giveCard(deck.getRandomCard());
                }
                if(dealer.getHitOrStanding() == 1){
                    dealer.giveCard(deck.getRandomCard());
                }
                if(player.getHitOrStanding() == 2 && dealer.getHitOrStanding() == 2) {
                    if (player.isWinning(dealer) && dealer.isWinning(player)) {
                        System.out.println("TIE AKA PUSH!");
                    } else if (player.isWinning(dealer)) {
                        System.out.println("Player won!");
                    } else {
                        System.out.println("Dealer won");
                    }
                }
            }


        }
    }

}
