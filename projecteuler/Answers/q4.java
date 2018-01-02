package projecteuler.Answers;
public class q4{
    public static void main(String[] args){
        int high = 0;
        for(int i=100;i<=999;i++){
            for(int k=100;k<=999;k++){
                int z = (k*i);
                String num = Integer.toString(z);
                //boolean b = z%10 == Character.getNumericValue( ( num ).charAt(0) );
                if( check(num) && z>high ){
                    high = z;
                    System.out.println(k+" x "+i+" = "+z);   
                }
            }
        }
        System.out.print(high);
        
    }
    public static boolean check(String num){
        int k = num.length()-1;
        for(int i=0;i<=num.length()-1;i++){
            if( Character.getNumericValue(num.charAt(i)) == Character.getNumericValue(num.charAt(k)) ){
                
            }else{
                return false;
            }
            k--;
        }
        return true;
    }
}