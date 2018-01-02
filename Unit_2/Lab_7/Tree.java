public class Tree{
    
    public static void treeStump(int height,int segments){
        String space = "";
        for(int i=1;i<=(2*height-(-2*segments+3))/2;i++){
            space+=" ";
        }
        System.out.println(space+"*");
        System.out.println(space+"*");
        for(int i=1;i<=((2*height-(-2*segments+3))/2)-3;i++){
            System.out.print(" ");
        }        
        System.out.print("*******");
    }
    
    public static void createTree(int height, int segments){
        int highestAmount = 2*height-(-2*segments+3);// Highest amount of * there will be in the last segment
        highestAmount = highestAmount/2;
        for(int i = 1;i<=segments;i++){
            
            for(int j = 1;j<=height;j++){
                int highestDots = 2*j-(-2*i+3); // Highest amount of * there will be in the current segment and line
                for(int k = 1;k<=highestAmount-(highestDots/2);k++){
                    System.out.print(" ");
                }
                for(int k = 1;k<=2*j-(-2*i+3);k++ ){
                    System.out.print("*");
                }
                System.out.println();
            } 
            
        }
        treeStump(height,segments);
    }
    public static void main(String args[]){
        int height = 4;
        int segments = 2;
        createTree(height,segments);
    }
}