import java.util.*;
public class q3{
    public static void main(String[] args){
        double MAX_NUM = 600851475143.0;
        double sum = 0;
        for(int i=1;i<=MAX_NUM;i++){
            if(MAX_NUM%i == 0){
                if( check( (double)(i) ) ){
                    System.out.println("Prime: "+(double)(i) );
                }
            }
        }
    }
    
    public static boolean check(double num){
        for(int i=2;i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}