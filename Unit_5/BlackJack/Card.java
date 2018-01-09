package Unit_5.BlackJack;

public class Card {
    private int[] Num = new int[2]; //This is an array just for the purpose
                                    //of having 2 values if the card is a ace
    private String Suit;
    public Card(int Num,String Suit){
        this.Num[0] = Num;          //sets the 0-index to the card value.
        if(Num == 1){
            this.Num[1] = 11;       //If its an ace, set the second value to one.
        }
        this.Suit = Suit;
    }
    public int[] getNumber(){
        int[] temp = new int[2];
        temp[0] = Num[0] > 10 ? 10 : Num[0];    //This returns the face value of the card (will return 10 if greater than 10)
        temp[1] = Num[1];                       //if the card is greater than 10, that means its a King,Queen or jack.
        return temp;
    }
    public String getSuit(){
        return this.Suit;
    }
    public String toString(){
        String num = "";
        if(getNumber()[0] == 11){
            num = "Jack";
        }else if(getNumber()[0] == 12){         //This will print out the card in a organized way.
            num = "Queen";
        }else if(getNumber()[0] == 13){
            num = "King";
        }else if(getNumber()[0] == 1){
            num = "Ace";
        }else{
            num = Integer.toString(getNumber()[0]);
        }
        return num+" of "+getSuit();
    }
}
