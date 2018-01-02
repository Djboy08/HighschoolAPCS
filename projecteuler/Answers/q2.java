import java.util.*;
public class q2{
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        for(int i=2;4000000>=l.get(i-2)+l.get(i-1);i++){
            l.add( l.get(i-2)+l.get(i-1) );
        }
        int s = 0;
        for(int v : l){
            if(v%2==0)s+=v;
        }
        System.out.println(s);
    }
}