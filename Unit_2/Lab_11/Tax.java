import java.util.*;
public class Tax {
    static double tax = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        begin(input);
    }
    public static int calcualateFirst(int a){
        if(a <= 3000){
            return a;
        } else {
            return a;
        }
    }
    public static int calcualateSecond(int a){
        if(a >= 3001 && a <= 5000){
            tax = tax + a * 0.10;
            return a    ;
        } else {    
            return a;   
        }
    }  
    public static int calcualateThird(int a){
        if(a >= 5001 && a <= 20000){
            tax = tax + a * 0.20;
            return a;
        } else {
            return a;
        }
    }      
    public static void calcuateFourth(int a){
        if (a > 20001){
        tax = tax + a * 0.30;
        }            
    }          
    
    
    public static void begin(Scanner input){
        System.out.print("A new tax has been implemented. How much do you annually earn? ");
        int Amount = input.nextInt();
        int first = calcualateFirst(Amount);
        int second = calcualateSecond(first);
        int third = calcualateThird(second);
        calcuateFourth(third);
        
        System.out.println("Your total tax is: " + tax);
    }
}