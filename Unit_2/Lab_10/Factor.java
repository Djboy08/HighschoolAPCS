import java.util.*;
public class Factor{
    public static String factorLoop(int range){
        int multication = 0; // I set the number I passed in as a stored variable
        String returned = "";
        for(int i=1;i<=range;i++){ //I set the variable to the number I passed in minus one. and increment by subtraction until its 1.
            if(range%i == 0){
                multication++;
                returned+=i+", ";
            }// Multiply the variable by itself and i.
        }
        returned+="which is "+multication+" factors";
        return returned;
    }
    public static int odd(int range){
        int z = 0;
        for(int i=1;i<=range;i++){ //I set the variable to the number I passed in minus one. and increment by subtraction until its 1.
            if(range%i == 0){
                if(i%2==1){
                  z++;  
                }
            }// Multiply the variable by itself and i.
        }        
        return z;
    }
    public static int even(int range){
        int z = 0;
        for(int i=1;i<=range;i++){ //I set the variable to the number I passed in minus one. and increment by subtraction until its 1.
            if(range%i == 0){
                if(i%2==0){
                  z++;  
                }
            }// Multiply the variable by itself and i.
        }        
        return z;
    }    
    public static void askFactor(){
        Scanner input = new Scanner(System.in);
        System.out.print("What factor do you want to know? -> ");
        int num = input.nextInt();
        String f = factorLoop(num);
        int Odd = odd(num);
        int Even = even(num);
        System.out.print("The Factors of "+num+" are "+f);
        System.out.println();
        System.out.println("It has "+Odd+" odd numbers and "+Even+" even numbers");
        int sum = Odd+Even;
        double OddPerc = (1.0*Odd/sum)*100;
        double EvenPerc = (1.0*Even/sum)*100;
        System.out.println("The odd percentage is "+OddPerc+" and the even percentage is "+EvenPerc);
    }
    public static void main(String args[]){
        askFactor();
    }
}