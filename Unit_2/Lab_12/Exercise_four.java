import java.util.*;
public class Exercise_four{
    
    static int Player1 = 0;
    static int Player2 = 0;
    static int toggleTurn = 1;
    public static int generateRandom(){
        return (int)(Math.random()*6+1);
    }
    public static int StartTurn(int Player,Scanner input,String Plr){
        int DiceRoll = 1;
        int newValue = Player;
        System.out.println(Plr+" Turn: Press 1 to stop your turn or press anything else to continue");
        int turn = 0;
        while(turn != 1){
            DiceRoll = generateRandom();
            System.out.println(Plr+" You rolled a "+DiceRoll);
            if(DiceRoll == 1){
                return Player;
            }else{
                System.out.println("end the turn to have a total score of "+(newValue+DiceRoll));
                newValue+=DiceRoll;
                if(newValue>=100){
                    return newValue;
                }
                turn = input.nextInt();
            }
        }
        System.out.println("Added a total of "+(newValue-Player)+" to the score");
        return newValue;
    }
    public static void Begin(Scanner input){
        while( !(Player1>100 || Player2>100) ){
            if(toggleTurn==1){
                Player1 = StartTurn(Player1,input,"Player1");
                toggleTurn = 0;
            }else if(toggleTurn == 0){
                Player2 = StartTurn(Player2,input,"Player2");
                toggleTurn = 1;
            }
        };
        if(Player1>100){
            System.out.print("Player 1 wins!");
            return;
        }
        System.out.print("Player 2 wins!");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Begin(input);
    }
    
}