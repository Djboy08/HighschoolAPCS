public class Hourglass{
    
    static int[][] glass = {
        {1,1,1,0,0,0},
        {0,1,0,0,0,0},
        {1,1,1,0,0,0},
        {0,0,2,4,4,0},
        {0,0,0,2,0,0},
        {0,0,1,2,4,0}
    };
    public static void generateRandom(){
       for(int row=0;row<=glass.length-1;row++){
            for(int col=0;col<=glass.length-1;col++){
                glass[row][col] = (int)(Math.random()*21-11);
            }
       }
    }
    public static void printHourglass(int[] location){
        System.out.println();
        for(int i=location[1];i<=location[1]+2;i++){
            System.out.printf("%-3s",glass[location[0]][i]+" ");
        }
        System.out.println("\n   "+glass[location[0]+1][location[1]+1]+"");
        for(int i=location[1];i<=location[1]+2;i++){
            System.out.printf("%-3s",glass[location[0]+2][i]+" ");
        }        
    }
    public static void printWholehourglass(){
         for(int row=0;row<=glass.length-1;row++){
            for(int col=0;col<=glass.length-1;col++){
                System.out.printf("%-5s",glass[row][col]+" ");
            }
            System.out.println();
         }
    }
    public static void findSum(){
        int[] location = new int[3]; //index 0 will be the index of the row, 1 will be index of col, sum, index 2 will be the highest sum
        for(int row=0;row<=glass.length-1;row++){
            for(int col=0;col<=glass.length-1;col++){
                
                if(col+2 <= glass.length-1 && row+2 <= glass.length-1){
/*sum of hourglass*/int sum = glass[row][col]+glass[row][col+1]+glass[row][col+2]+glass[row+1][col+1]+glass[row+2][col+1]+glass[row+2][col+2]+glass[row+2][col];
                    if(sum>location[2]){
                        location[2] = sum;
                        location[0] = row;
                        location[1] = col;
                    }
                }
                
            }  
        }
        printWholehourglass();
        printHourglass(location);
    }
    public static void main(String[] args){
        generateRandom();
        findSum();
    }
}