import java.util.*;
public class prime{
    
    static int[] primelist = new int[21];
    static boolean[] primed = new boolean[21];
    
    public static void primeList(int z){
        int locater = z*2;
        for(int i = 0; i<=primelist.length-1;i++){
            if(locater == primelist[i]){
                primed[i] = false;
                locater+=z;
            }
        }
    }
    public static void begin(){
        
        for(int i = 2; i<=primelist.length-1;i++){
            primeList(i);
        }
        
        for(int i=1;i<=primelist.length-1;i++){
            if(primed[i]){
                System.out.print(primelist[i]+", ");
            }
        }
        
    }
    public static void main(String[] args){
        for(int i=0;i<=primed.length -1; i++){
            primed[i] = true;
            primelist[i] = i+1;
        }
        begin();
    }
}