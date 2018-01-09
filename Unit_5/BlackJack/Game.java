package Unit_5.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    Deck deck;
    public Game() {
        deck = new Deck();
    }
    public void blackjack(){
        ArrayList<Card> c = deck.getDeck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        int Bet = 0;
        int Round = 1;
        while (player.getCash() > 0) {
            //Starting round
            System.out.println("------------------");
            player.reset();
            dealer.reset();
            for (int i = 1; i <= 2; i++) {
                player.giveCard(deck.getRandomCard());
                dealer.giveCard(deck.getRandomCard());
            }
            player.setHitOrStanding(1);
            dealer.setHitOrStanding(1);
            System.out.println("\n\nRound: "+(Round++)+" CASH: "+player.getCash());
            System.out.print("How much money would you like to bet? -->  $");
            Bet = input.nextInt();
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
                    if(player.highestScore() > 21){
                        System.out.println("YOU BUSTED!");
                        player.setHitOrStanding(2);
                    }
                }
                if(dealer.getHitOrStanding() == 1){
                    dealer.giveCard(deck.getRandomCard());
                    if(dealer.highestScore() > 21){
                        System.out.println("DEALER BUSTED!");
                        dealer.setHitOrStanding(2);
                    }
                }
                if(player.getHitOrStanding() == 2 && dealer.getHitOrStanding() == 2) {
                    System.out.println("Player: "+player.highestScore()+"("+player.isWinning(dealer)+") VS Dealer: "+dealer.highestScore()+"("+dealer.isWinning(player)+")");
                    if (player.isWinning(dealer) == dealer.isWinning(player)) {
                        System.out.println("TIE AKA PUSH!");
                    } else if (player.isWinning(dealer)) {
                        System.out.println("Player won!");
                        if(player.getCards().size() == 2){
                            player.setCash(player.getCash() + Bet*1.5);
                        }else{
                            player.setCash(player.getCash() + Bet);
                        }
                    } else {
                        System.out.println("Dealer won");
                        player.setCash(player.getCash() - Bet);
                    }
                }
            }


        }
        System.out.println("\n\nYou ran out of money!?");
    }

}
