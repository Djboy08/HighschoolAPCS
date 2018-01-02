import java.util.*;

public class TextLab0590v{
    static int num = 1;
    static int den = 1;
    static int num2 = 1;
    static int den2 = 1;    
    public static void main(String[] args){
        enterData();
        Rational r1 = new Rational(num,den);
        Rational r2 = new Rational(num2,den2);
        Rational r3 = new Rational();
        
        r3.multiply(r1,r2);
        r3.reduce();
        System.out.println(r1.getOriginal() + " * "+r2.getOriginal() + " = " + r3.getRational());
        r3.divide(r1,r2);
        r3.reduce();
        System.out.println(r1.getOriginal() + " / "+r2.getOriginal() + " = " + r3.getRational());  
        r3.add(r1,r2);
        r3.reduce();
        System.out.println(r1.getOriginal() + " + "+r2.getOriginal() + " = " + r3.getRational());    
        r3.subtract(r1,r2);
        r3.reduce();
        System.out.println(r1.getOriginal() + " - "+r2.getOriginal() + " = " + r3.getRational());            
        
        //r.displayData();
    }
    public static void enterData(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the 1st numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the 1st denominater ---->");
        den = input.nextInt();
        System.out.print("\nEnter the 2nd numerator ----> ");
        num2 = input.nextInt();
        System.out.print("\nEnter the 2nd denominater ---->");
        den2 = input.nextInt();        
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
    public Rational(){
        this(0,0);
    }
    public int getNum(){
        return num;
    }
    public int getDen(){
        return den;
    }
    public String mixedNumber(){
        if(getDecimal() > 1){
            int num = getNum()%getDen();
            int mixed = getNum()/getDen();
            return " ("+mixed+" "+num+"/"+getDen()+" )";
        }
        return "";
    }    
    public double getDecimal(){
        return 1.0*firstNum/firstDen;
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
        System.out.println(getOriginal() + " equals " + getDecimal());
        System.out.println();    
        System.out.println("and reduces to "+getRational());
    }
    
    public void multiply(Rational r1, Rational r2){
        this.num = r1.getNum()*r2.getNum();
        this.den = r1.getDen()*r2.getDen();
    }
    public void divide(Rational r1, Rational r2){
        this.num = r1.getNum() * r2.getDen();
        this.den = r1.getDen() * r2.getNum();
    }    
    public void add(Rational r1, Rational r2){
        int num1 = r1.getNum()*r2.getDen();
        int num2 = r2.getNum()*r1.getDen();
        this.num = num1+num2;
        this.den = r1.getDen()*r2.getDen();
    }
    public void subtract(Rational r1, Rational r2){
        int num1 = r1.getNum()*r2.getDen();
        int num2 = r2.getNum()*r1.getDen();
        this.num = num1-num2;
        this.den = r1.getDen()*r2.getDen();
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
