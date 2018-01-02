import java.util.*;
public class q7{
    public static void main(String[] args){
        double MAX_NUM = Double.MAX_VALUE;
        ArrayList<Double> list = new ArrayList<Double>();
        int i =0;
        while(list.size() < 10002){
            i++;
            if( check( (double)(i) ) ){
                list.add( (double)(i) );
                System.out.println("Prime: "+(double)(i) );
            }
        }
        System.out.println(list.get(10001));
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