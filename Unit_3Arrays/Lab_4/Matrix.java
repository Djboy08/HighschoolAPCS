import java.util.*;
public class Matrix {
    static ArrayList<Integer> list;
    static int listSize;
    static int numRows=3;
    static int numCols=5;
    
    public static void displayMatrix(){
        if(list.size() > 0){
            System.out.println("Matrix "+numRows+" X "+numCols+" Display");
            for(int row = 1;row<=numRows;row++){
                for(int col = 1; col<=numCols; col++){
                    System.out.print(list.get((row*numCols-numCols+col)-1)+" ");
                }
                System.out.println();
            }
            //for(int location=0;location<list.size();location++){
            //    System.out.print(list.get(location)+" ");
            //    if(location%numCols == numCols-1)System.out.println();
            //}
        }else{
            System.out.println("Matrix m1 Default Display\nMatrix has no elements");
        }
    }
    public static void setValue(int row,int col,int val){
        list.set((row*numCols-numCols+col)-1,val);
    }
    public static int getValue(int row,int col){
        return list.get((row*numCols-numCols+col)-1);
    }
    public static void resize(int rows, int cols){
      int size = rows*cols;
      if(size > listSize){
          for(int i=1;i<=size - listSize;i++){
              list.add(0);
          } 
          listSize = list.size();
      }else{
          for(int i=list.size()-1;i>=size;i--){
              list.remove(i);
          }
      }
      numRows = rows;
      numCols = cols;
    }
    public static void begin(Scanner input){
        int row = 1;
        int col = 1;
        int exit = 0;
        while(exit == 0){
            System.out.println("Please type the row number u want to change");
            row = input.nextInt();
            System.out.println("Please type the col number u want to change");
            col = input.nextInt();
            System.out.println("Please type the value you want to insert");
            setValue(row,col,input.nextInt());
            System.out.println("Type any number other than 0 if you want to exit.");
            exit = input.nextInt();
            displayMatrix();
        };
        exit = 0;
        while(exit == 0){
            System.out.println("Please type the row number u want to get");
            row = input.nextInt();
            System.out.println("Please type the col number u want to get");
            col = input.nextInt();
            System.out.println("The value is "+getValue(row,col));
            System.out.println("Type any number other than 0 if you want to exit.");
            exit = input.nextInt();            
        }
        System.out.println("What row size do you want the matrix to be?");
        row = input.nextInt();
        System.out.println("What column size do you want the matrix to be?");
        col = input.nextInt();
        resize(row,col);
        displayMatrix();
    }
    public static void main(String[] args){
        list = new ArrayList<Integer>();
        for(int i=1;i<=15;i++){
            list.add(100+(i-1));
        }
        listSize = list.size();
        displayMatrix();
        Scanner input = new Scanner(System.in);
        begin(input);
    }
}