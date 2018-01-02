public class Rocket{
    static final int HEIGHT = 2;
    public static void RocketTop(){
        for(int i=1;i<=5;i++){ // I want to produce 5 lines
            String spacing = "";
            for(int j=0;j<=5-i;j++){//I want to make up to 4 spaces. However, for each line of the rocket we take a space away.
                spacing += " ";     //I store the spacing as a variable
            }
            System.out.print(spacing);//Print out the spacing
            for(int k=1;k<=i;k++){//for the line number we are on we produce the same amount of slashes
                System.out.print("/");
            }
            System.out.print("**");//This does not need a loop
            for(int k=1;k<=i;k++){
                System.out.print("\\");//Same as the previous loop but the backslash.
            }            
            System.out.println();
        }
    }
    
    public static void drawLine(){
        System.out.print("+");
        for(int i=1;i<=6;i++){
            System.out.print("=*");//Print this 6 times.
        }
        System.out.print("+");
        System.out.println();
    }
    public static void middleUpperSection(){
        for(int i=1;i<=3;i++){//Create 3 lines for the upper section.
            String dots = "";// This variable will be used for the dots.
            String arrows = "";//This variable will be used for the slashs
            System.out.print("|");//Start of the line
            for(int j=0;j<=2-i;j++){//for each line we subtract a dot starting with 2 dots.
                dots += ".";
            }
            System.out.print(dots);
            for(int k=1;k<=i;k++){//for each line we add another set of arrows
                arrows+="/\\";
            }
            System.out.print(arrows);//After we printed the dots we print the arrows, This would be the first half of the section.
            System.out.print(dots+dots+arrows+dots);//We set those variables so we did not need to run the loops again so we just print out the variables.
            System.out.print("|");
            System.out.println();
        }
    }
    
    public static void middleLowerSection(){//This section is the same as the first section but flipped
        for(int i=3;i>=1;i--){
            String dots = "";
            String arrows = "";
            System.out.print("|");
            for(int j=0;j<=2-i;j++){
                dots += ".";
            }
            System.out.print(dots);
            for(int k=1;k<=i;k++){
                arrows+="\\/";
            }
            System.out.print(arrows);
            System.out.print(dots+dots+arrows+dots);
            System.out.print("|");
            System.out.println();
        }
    }
    
    public static void CreateRocket(){
        RocketTop();//I create the top of the rocket
        drawLine();//I make the line seperating the top and section
        for(int i=1;i<=HEIGHT;i++){// this will loop for the size you want
            middleUpperSection();
            middleLowerSection();
            drawLine();
            middleLowerSection(); 
            middleUpperSection();
            drawLine();
        }
        RocketTop();// ending the rocket loop
    }
    public static void main(String args[]){
        CreateRocket();
    }
}