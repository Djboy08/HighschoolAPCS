import java.util.*;
public class Lab{
    public static int RequestValidation(Scanner input){ // this method will keep asking for a correct input (number between 1 and 3)
        int Response = input.nextInt();
        while(!(Response > 0 && Response <= 4)){
            System.out.print("Not a valid number 1-3, Pick again: ");
            Response = input.nextInt();
        }
        return Response;
    }
    public static int generateComputer(){ //generates the random number for the computer
        Random ran = new Random();
        return ran.nextInt(3)+1;
    }
    public static String getChoice(int num){ // converts the number 1-3 to a string value.
        if(num==1){
            return "Rock";
        }else if(num==2){
            return "Paper";
        }else if(num==3){
            return "Scissors";
        }
        return "Error";
    }
    public static double calculateStats(double games,double wins,double moves){ // gets the win percentage of a game.
        return (1.0*wins/games)*100;
    }
    public static void compareStats(Scanner input){  //this method will take the stats of two players and see which had a better win percentage
        System.out.print("\nNow we will compare the two players.\n P1 FIRST: \n");
        System.out.print("What is the avg amount of games P1 played: ");
        double games1 = input.nextDouble();
        System.out.print("What is the avg amount of wins for each game:");
        double wins1 = input.nextDouble();
        System.out.print("What is the avg amount of moves for each game: ");
        double moves1 = input.nextDouble();    
        
        System.out.println(" P2: ");
        System.out.print("What is the avg amount of games P2 played: ");
        double games2 = input.nextDouble();
        System.out.print("What is the avg amount of wins for each game: ");
        double wins2 = input.nextDouble();
        System.out.print("What is the avg amount of moves for each game: ");
        double moves2 = input.nextDouble();       
        
        double game1stats = calculateStats(games1,wins1,moves1);
        double game2stats = calculateStats(games2,wins2,moves2);
        if(moves1 > moves2){
            game2stats+=5;
        }else{
            game1stats+=5;
        }
        System.out.println("Player.java 1 has a win % of "+game1stats+" and Player.java 2 has a win % of "+game2stats);
    }
    public static String Begin(Scanner input){
        System.out.print("Choose a number,\nRock=1\nPaper=2\nScissors=3\nOr use 4 to end the game");
            int Response = 0;
            int Computer = generateComputer();
        while(Response != 4){
            System.out.print("Your Number: ");
            Response = RequestValidation(input);
            if(Response != 4){
                Computer = generateComputer();            
                System.out.println("Player.java picked "+getChoice(Response)+" and Computer picked "+getChoice(Computer));
                if(Response == 1 && Computer == 3){
                    System.out.println("Player.java wins!");
                }else if(Response == 2 && Computer == 1){
                    System.out.println("Player.java wins!");
                }else if(Response == 3 && Computer == 2){
                    System.out.println("Player.java wins!");
                }else if(Response == Computer){
                    System.out.println("Its a tie!");
                }else{
                    System.out.println("Computer won!");
                }
            }
        }
        System.out.println("Game has ended");
        
        
        compareStats(input);
        
        
        
        return "Test";
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String result = Begin(input);
    }
}