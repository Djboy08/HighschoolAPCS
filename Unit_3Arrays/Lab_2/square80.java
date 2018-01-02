import java.util.*;
public class square80{
    static int[][] square;
    //{ {0,0,0},{0,0,0},{0,0,0} }
    public static int[] getLocation(int[] l){
        boolean location = true;
        int row = l[0];
        int col = l[1];
        int max = square.length-1;
            int originalRow = row;
            int originalCol = col;
                if(row-1 < 0){
                    row = max;
                }else{
                    row = row-1;
                }
            if(col+1 > max){
                col = 0;
            }else{
                col = col+1;
            }
            if(square[row][col] != 0 ){
                row = originalRow+1;
                col = originalCol;
            }
        l = new int[2];
        l[0] = row;
        l[1] = col;
        return l;
    }
    public static void startSquare(int index){
        int[] locations = {0,index};
        square[0][index] = 1;
        for(int i = 2; i<=square.length*square.length; i++){
            locations = getLocation(locations);
            square[ locations[0] ][ locations[1] ] = i;
        }
    }
    public static void displayMagicSquare(){
        for(int row = 0; row<=square.length-1; row++){
            for(int col = 0; col<= square[row].length -1; col++){
                System.out.printf("%03d ",square[row][col]);
            }
        System.out.println();
        };
    }
    public static void computeMagicSquare(int size){
        square = new int[size][size];
        int starting = square[0].length/2;
        startSquare(starting);
        displayMagicSquare();
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("What odd size square do you want?");
        int size = input.nextInt();
        System.out.println("Creating a magic square of "+size+"x"+size);
        computeMagicSquare(size);
    }
}