public class Stairs{
    static final int STAIRS = 5;
    public static void head(){
        System.out.print("o  ******");
    }
    public static void drawLine(){
        for(int i=1;i<=5*STAIRS+7;i++){
            System.out.print("*");
        }
    }    
    public static void Stairs(){
        for(int i=STAIRS;i>=1;i--){
            int spaces = 0;
            String extraspace = "";//spaces after the figure
            String mainspaces = "";//the spsaces before the figure
            for(int j=1;j<=5*i-3;j++){
                spaces++;
                System.out.print(" ");
            }
            head();
            for(int h = 1;h<=-5*i+(STAIRS*5);h++){
                extraspace+=" ";
            }
            for(int k=1;k<=spaces-1;k++){
                mainspaces+=" ";
            }
            
            System.out.print(extraspace);
            System.out.print("*");
            System.out.println();
            //Below is stuff that follows the figures
            System.out.print(mainspaces);
            System.out.print("/|\\ *" );
            System.out.print(extraspace+"     *\n");//The figure already had 5 defualt spaces.
            System.out.print(mainspaces);
            System.out.print("/ \\ *" );
            System.out.print(extraspace+"     *\n");          
            
        }
        
    }

    
    public static void main(String[] args){
        Stairs();
        drawLine();
    }
}