package Unit_5.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        beginGame(input);
    }
    public static void beginGame(Scanner input){
        Deck deck = new Deck();
        ArrayList<Card> c = deck.getDeck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        while(player.getCash() > 0){
            //Starting round
            for(int i =1;i<=2;i++) {
                player.giveCard(deck.getRandomCard());
                dealer.giveCard(deck.getRandomCard());
            }
            System.out.println("Player has: ");
            ArrayList<Card> cards = player.getCards();
            System.out.print(cards.get(0));
            for(int i=1;i<=cards.size()-1;i++){
                System.out.print(", "+cards.get(i));
            }


        }
    }
}
