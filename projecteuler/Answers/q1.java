package projecteuler.Answers;
public class q1{
    public static void main(String[] args){
        int MAX_NUM = 1000;
        int sum = 0;
        for(int i=1;i<MAX_NUM;i++){
            if(i%3 == 0 || i%5 == 0){
                sum+=i;
            }
        }    
        System.out.println(sum);
    }
}