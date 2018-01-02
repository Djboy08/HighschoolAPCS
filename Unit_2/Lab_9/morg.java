import java.util.*;
public class morg{
    
    public static void calculatePayment(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal? -> $");
        double Principal = input.nextDouble();
        System.out.print("What is the Intrest? -> ");
        double Intrest = input.nextDouble();
        Intrest = (Intrest/100)/12;
        System.out.print("What is the length in years? -> ");
        double Years = input.nextDouble();
        Years = Years*12;
        //Caculations below
        double Power = Math.pow((1+Intrest),Years);
        double caculation = ( (Intrest*Power) / (Power - 1) ) * Principal;
        System.out.print("Monthly Payment: $"+caculation);
         
        
    }
    public static void main(String args[]){
        calculatePayment();
    }
}