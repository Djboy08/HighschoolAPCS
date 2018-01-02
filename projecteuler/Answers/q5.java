package projecteuler.Answers;
public class q5{
    public static void main(String[] args){
        int num = 1;
        boolean z = false;
        while(true){
            z = false;
            for(int i=1;i<=20;i++){
                if(num%i == 0){
                    
                }else{
                    z = true;
                }
            }
            if(z){
                num++;
                z = false;
            }else{
                System.out.println(num);
                break;
            }
        }
    }
}