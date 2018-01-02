package Unit_4.Lab_1.TextLab04st100v;
import java.util.*;

public class TextLab04st100v{
    static int num = 1;
    static int den = 1;
    public static void main(String[] args){
        enterData();
        Rational r = new Rational(num,den);
        r.reduce();
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
    int num,den,firstNum,firstDen;
    public Rational(int num,int den){
        this.num = num;
        this.den = den;
        this.firstDen = den;
        this.firstNum = num;
    }
    public int getNum(){
        return num;
    }
    public int getDen(){
        return den;
    }
    public double getDecimal(){
        return 1.0*firstNum/firstDen;
    }
    public String mixedNumber(){
        if(getDecimal() > 1){
            int num = getNum()%getDen();
            int mixed = getNum()/getDen();
            return " ("+mixed+" "+num+"/"+getDen()+" )";
        }
        return "";
    }
    public String getOriginal(){
        return this.firstNum + "/" + this.firstDen;
    }
    public void reduce(){
        int g = getGCF(this.num,this.den);
        this.num = num/g;
        this.den = den/g;
    }
    public String getRational(){
        return getNum() + "/" + getDen();
    }
    public void displayData(){
        System.out.println();
        System.out.println(getOriginal() + " equals " + getDecimal()+mixedNumber());
        System.out.println();    
        System.out.println("and reduces to "+getRational());
        
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
