package Unit_5.BlackJack;

import java.util.*;
public class Player {
    private ArrayList<Card> cards = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private double cash = 500;
    private int HitOrStanding = 1; // 1 = hit, 2 = stand

    public void giveCard(Card c){
        cards.add(c);
    }

    public ArrayList<Card> getCards(){
        return cards;
    }

    public void reset(){
        cards.clear();
    }

    public void stand(){
        //Stop turn
    }
    public int response(){
        System.out.println("\nPlease press 1 to hit, or 2 to stand"); //The method asks if they want to hit or stand
        int in = input.nextInt();
        this.setHitOrStanding(in);
        return in;
    }
    public int getHitOrStanding(){
        return this.HitOrStanding;
    }
    public void setHitOrStanding(int arg){
        this.HitOrStanding = arg;
    }
    public double getCash(){
        return cash;
    }
    public void setCash(double c){
        this.cash = c;
    }
    public int[] getTotalScore(){
        int sum = 0,sum2 = 0;
        int baseCards = 0;
        int Aces = 0;
        for(int i=0;i<=cards.size()-1;i++){
            if(cards.get(i).getNumber()[0] != 1){
                baseCards = baseCards + cards.get(i).getNumber()[0]; //I add up all the values except for ACES to a variable
            }else{
                Aces++; // I count how many Aces there are.
            }
        }
        int AcesSum = Aces;
        sum2 = baseCards;
        for(int i = 1; i <= Aces; ++i) {
            if (AcesSum + baseCards <= 21 && AcesSum + baseCards > baseCards) {             //I start by adding all the aces 1s EX 3 ACES:
                sum2 = AcesSum + baseCards;                                                 //1+1+1 = 3;
            }                                                                               //11+1+1 = 13;
            if(Aces == 1 && 11+baseCards <= 21 && 11 + baseCards > baseCards){              //11+11+1 = 23;
                sum2 = 11+baseCards;//if theres only one ace do this                        //11+11+11 = 33;
            }                                                                               //This is also making sure its added onto the based cards
                                                                                            //and seeings if its less than 21.
            AcesSum = i * 11 + (Aces - i);
        }

        int[] r = {baseCards+Aces,sum2};
        return r;
    }
    private int totalSum(int[] p){
        return p[0] == p[1] ? p[0] : ( (p[0] > p[1]) ? p[0] : ( (p[0] < p[1] ? p[1] : -5) ));
        //This makes sure if the basecards alone with no ace 11s is better than basecards WITH ace 11s
    }

    public int highestScore(){
        return totalSum(getTotalScore()); //Uses the totalSum method with the TotalScore method to get the correct calculation
    }

    public boolean isWinning(Player o){
        int totalPlayer = 0, totalDealer = 0;
        int[] p = this.getTotalScore(),d = o.getTotalScore();
        totalPlayer = totalSum(p);
        totalDealer = totalSum(d);
        if(totalPlayer == totalDealer){
            return false;
        }else if(totalPlayer > totalDealer && totalPlayer <= 21){   //returns true if the player is winning and false if they are loosing or its a tie.
            return true;
        }else if(totalPlayer > 21 && totalDealer > 21){
            return false;
        }else if(totalPlayer <= 21 && totalDealer > 21){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String ret = "Player Has:\n"; //Simply prints neatly
        ArrayList<Card> cards = this.getCards();
        ret+=cards.get(0);
        for (int i = 1; i <= cards.size() - 1; i++) {
            ret+=", " + cards.get(i);
        }
        return ret;
    }
}
