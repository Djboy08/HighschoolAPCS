package Unit_5.BlackJack;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    private Card[] list = new Card[52]; //I initilize a array of 52 card objects that will be used later.
    public Deck(){
        for(int i = 0;i<52;i++) {
            int mod = i % 13;
            if (i <= 12) {
                list[i] = new Card(mod + 1, "Spades");
            } else if (i <= 25) {
                list[i] = new Card(mod + 1, "Clubs");  //I create a non-shuffled deck with 13 cards of each suit.
            } else if (i <= 38) {
                list[i] = new Card(mod + 1, "Diamonds");
            } else {
                list[i] = new Card(mod + 1, "Hearts");
            }
        }
        shuffle();
    }
    public Card getRandomCard(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
    public void shuffle(){
        boolean[] check = new boolean[52];
        System.out.println("Shuffling");
        while(deck.size() != 52){//I make sure the deck will eventually be a full deck
            int location = (int) (Math.floor(Math.random() * 52));  //this method will get random cards from the organized
            if(!(check[location])){                                 //deck and add it into an arraylist for the deck that
                deck.add(list[location]);                           //will be used for the game.
                check[location] = true;                             //Note that I use the math class in order to get random.
            }
        }
        System.out.println("Shuffled");
    }
    public ArrayList<Card> getDeck(){
        return deck;
    }

}
