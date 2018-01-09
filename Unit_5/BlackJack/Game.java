package Unit_5.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in); //This is user input that would be asked for the bets
    Deck deck;
    public Game() {
        deck = new Deck(); //I construct thew new deck upon constructing a game.
    }
    public void blackjack(){
        Player player = new Player();
        Dealer dealer = new Dealer();
        int Bet;
        int Round = 1;
        while (player.getCash() > 0) { //This loop will continue to go until the player runs out of money.
            //Starting round
            System.out.println("------------------");
            player.reset();
            dealer.reset();
            for (int i = 1; i <= 2; i++) {
                player.giveCard(deck.getRandomCard());
                dealer.giveCard(deck.getRandomCard());
            }
            player.setHitOrStanding(1); //These methods are setting up the hand for the dealer and player.
            dealer.setHitOrStanding(1);
            System.out.println("\n\nRound: "+(Round++)+" CASH: "+player.getCash());
            System.out.print("How much money would you like to bet? -->  $");
            Bet = input.nextInt();
            while(player.getHitOrStanding() != 2 || dealer.getHitOrStanding() != 2) { //This loop will continue to go until they both stand.
                System.out.println(player);//I show the hands.
                System.out.println(dealer);
                if(deck.getDeck().size() <= 5){
                    deck = new Deck(); //If the deck is about to run out of cards create a new one.
                }
                if(player.getHitOrStanding() == 1) {//These two methods check if the player hit from the prev turn.
                    player.response();              //If they did hit, ask their next response to hit or stand.
                }
                if(dealer.getHitOrStanding() == 1) {
                    dealer.response();
                }
                if(player.getHitOrStanding() == 1){//This check if the player hits then to give them a card and check if they bust
                    player.giveCard(deck.getRandomCard());
                    if(player.highestScore() > 21){
                        System.out.println("YOU BUSTED!");
                        player.setHitOrStanding(2);
                    }
                }
                if(dealer.getHitOrStanding() == 1){// Same for the dealer.
                    dealer.giveCard(deck.getRandomCard());
                    if(dealer.highestScore() > 21){
                        System.out.println("DEALER BUSTED!");
                        dealer.setHitOrStanding(2);
                    }
                }
                if(player.getHitOrStanding() == 2 && dealer.getHitOrStanding() == 2) {//These nested if statements check to see who wins.
                    System.out.println("Player: "+player.highestScore()+"("+player.isWinning(dealer)+") VS Dealer: "+dealer.highestScore()+"("+dealer.isWinning(player)+")");
                    if (player.isWinning(dealer) == dealer.isWinning(player)) {
                        System.out.println("TIE AKA PUSH!");
                    } else if (player.isWinning(dealer)) {
                        System.out.println("Player won!");
                        if(player.getCards().size() == 2){ // If the player has blackjack increase their bet and give them the money.
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
