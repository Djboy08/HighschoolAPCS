package Unit_5.BlackJack;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    private Card[] list = new Card[52];
    public Deck(){

        for(int i = 0;i<52;i++){
            int mod = i%13;
            if(i <= 12) {
                list[i] = new Card(mod+1,"Spades");
            }else if(i <= 25){
                list[i] = new Card(mod+1,"Clubs");
            }else if(i <= 38){
                list[i] = new Card(mod+1,"Diamonds");
            }else{
                list[i] = new Card(mod+1,"Hearts");
            }
        }
        shuffle();
    }
    public Card getRandomCard(){
        int location = (int)(Math.ceil(Math.random()*deck.size())-1);
        Card card = deck.get(location);
        deck.remove(location);
        return card;
    }
    public void shuffle(){
        boolean[] check = new boolean[52];
        System.out.println("Shuffling");
        while(deck.size() != 52){
            int location = (int) (Math.floor(Math.random() * 52));
            if(!(check[location])){
                deck.add(list[location]);
                check[location] = true;
            }
        }
        System.out.println("Shuffled");
    }
    public ArrayList<Card> getDeck(){
        return deck;
    }

}
