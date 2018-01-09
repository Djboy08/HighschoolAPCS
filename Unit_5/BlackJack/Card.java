package Unit_5.BlackJack;

public class Card {
    private int[] Num = new int[2];
    private String Suit;
    public Card(int Num,String Suit){
        this.Num[0] = Num;
        if(Num == 1){
            this.Num[1] = 11;
        }
        this.Suit = Suit;
    }
    public int[] getNumber(){
        int[] temp = new int[2];
        temp[0] = Num[0] > 10 ? 10 : Num[0];
        temp[1] = Num[1];
        return temp;
    }
    public String getSuit(){
        return this.Suit;
    }
    public String toString(){
        String num = "";
        if(getNumber()[0] == 11){
            num = "Jack";
        }else if(getNumber()[0] == 12){
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
