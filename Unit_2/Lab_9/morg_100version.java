import java.util.*;
public class morg_100version{
   
    public static double caculatePayments(double monthly,double Years){
        return monthly*12*Years;
    }
    public static double caculateIntrest(double totalPayment,double Principal){
        return totalPayment-Principal;
    }
    public static double roundToPenny(double Num){
        return (double)Math.round(Num*100.0)/100.0;
    }
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
        double Rounded = roundToPenny(caculation);
        System.out.println("Monthly Payment: $"+Rounded);
        
        double TotalPayments = caculatePayments(Rounded,Years/12);
        Rounded = roundToPenny(TotalPayments);
        System.out.println("Total Payments: $"+TotalPayments);
        
        double TotalIntrest = caculateIntrest(TotalPayments,Principal);
        Rounded = roundToPenny(TotalIntrest);
        System.out.println("Total Intrests: $"+TotalIntrest);        
        
    }
    public static void main(String args[]){
        calculatePayment();
    }
}