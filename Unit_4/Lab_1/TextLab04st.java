
import java.util.*;

public class TextLab04st{
    static int num = 1;
    static int den = 1;;
    public static void main(String[] args){
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
    }
    public static void enterData(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the numerator ---->");
        den = input.nextInt();
    }
    
}

class Rational {
// Rational
// getNum
// getDen
// getDecimal
// getRational
// getOriginal
// reduce
    int num,den;
    public Rational(int num,int den){
        this.num = num;
        this.den = den;
    }
    public int getNum(){
        return num;
    }
    public int getDen(){
        return den;
    }
    public double getDecimal(){
        return 1.0*num/den;
    }
    public int getOriginal(){
        return num/den;
    }
    public String getRational(){
        return getNum() + "/" + getDen();
    }
    public void displayData(){
        System.out.println();
        System.out.println(getRational() + " equals " + getDecimal());
        System.out.println();    
    }
    private int getGCF(int n1,int n2){
        int rem = 0;
        int gcf = 0;
        do{
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else{
                n1 = n2;
                n2 = rem;
            }
        }while (rem != 0);
        return gcf;
    }
}

