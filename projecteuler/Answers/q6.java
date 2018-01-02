public class q6{
    public static void main(String[] args){
        int squares = 0;
        int sumsquared = 0;
        for(int i=1;i<=100;i++){
            squares     = squares + (i*i);
            sumsquared  = sumsquared + i;
        }
        sumsquared = sumsquared*sumsquared;
        System.out.println(sumsquared-squares);
    }
}