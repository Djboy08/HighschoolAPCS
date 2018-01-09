package Unit_5.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String args[]){
        Game game = new Game();             //I create a game object that could hold more games later on.
        game.blackjack();                   //I run the blackjack game.
    }
}
