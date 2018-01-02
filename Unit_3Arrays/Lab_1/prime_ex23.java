import java.util.*;
public class prime_ex23{
    
    static int[] primelist;
    static boolean[] primed;
    
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
                System.out.printf("%04d ",primelist[i]);
            }
        }        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the rang? --> ");
        int length = input.nextInt();
        primelist = new int[length];
        primed = new boolean[length];
        for(int i=0;i<=primed.length -1; i++){
            primed[i] = true;
            primelist[i] = i+1;
        }
        computePrimes();
        displayPrimes();
    }
}