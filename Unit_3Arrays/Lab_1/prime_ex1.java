import java.util.*;
public class prime_ex1{
    
    static int length = 100;
    static int[] primelist = new int[length];
    static boolean[] primed = new boolean[length];
    
    public static void primeList(int z){
        int locater = z*2;
        for(int i = 0; i<=primelist.length-1;i++){
            if(locater == primelist[i]){
                primed[i] = false;
                locater+=z;
            }
        }
    }
    public static void computePrimes(){
        
        for(int i = 2; i<=primelist.length-1;i++){
            primeList(i);
        }
        
        
    }
    
    public static void displayPrimes(){
        System.out.println("Computing numbers between 1 and "+primelist.length); 
        for(int i=1;i<=primelist.length-1;i++){
            if(primed[i]){
                System.out.print(primelist[i]+" ");
            }
        }        
    }
    public static void main(String[] args){
        for(int i=0;i<=primed.length -1; i++){
            primed[i] = true;
            primelist[i] = i+1;
        }
        computePrimes();
        displayPrimes();
    }
}