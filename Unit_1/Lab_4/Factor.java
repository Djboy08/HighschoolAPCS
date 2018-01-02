public class Factor{
   
    public static void factorLoop(int range){
        int multication = range; // I set the number I passed in as a stored variable
        for(int i=range-1;i>=1;i--){ //I set the variable to the number I passed in minus one. and increment by subtraction until its 1.
            multication = multication*i;// Multiply the variable by itself and i.
        }
        System.out.println("the factorial of "+range+" is "+multication);//Print out the factor of the number
    }
    
    public static void main(String[] args){
        factorLoop(5); // I passed in the number I want to factor, EX: 5.
        factorLoop(4);
        factorLoop(8);
        factorLoop(15);
        factorLoop(6);
        factorLoop(9);
        factorLoop(3);
        
    }
    
}