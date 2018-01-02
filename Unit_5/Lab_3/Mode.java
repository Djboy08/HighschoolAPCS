package Unit_5.Lab_3;
import java.util.*;
public class Mode {
    public static int mode(int[] array){
        ArrayList<Value> a = new ArrayList<Value>();
        for(int i=0;i<=array.length-1;i++){
            if(Mode.find(a,array[i]) == 1){
                //Increments
            }else{
                //Adds to list. 
                System.out.println(array[i]);
                a.add( new Value(array[i],1) );   
                System.out.println("Added");
            }
        }
        
        int Highest = 0;
        for(Value x : a){
            System.out.println(x.getValue()+" COUNTER: "+x.getCounter());
            if( x.getCounter() > Highest ){
                Highest = x.getValue();
            }
        }
        return Highest;
    }
    public static int find(ArrayList<Value> list, int target){
        for(int i = 0;i<=list.size()-1;i++){
            if( list.get(i).getValue() == target ){
                list.get(i).increment();
                return 1;
            }
        }
        return 2;
    }
} 