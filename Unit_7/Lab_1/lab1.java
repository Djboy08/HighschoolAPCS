package Unit_7.Lab_1;

public class lab1 {
    public static void main(String args[]){
        System.out.println("TextLab13");
        skip2();
        System.out.println("Counting from 1 up to 10");
        Test.countUp(1,10);
        skip3();
        System.out.println("Counting from 10 down to 1");
        Test.countDown(1,10);
        skip3();
        System.out.println("The sum of all integers 0 to 100 are " + Test.sum(100));
        skip2();
        System.out.println("The factorial of 8 is " + Test.fact(8));
        skip2();
        System.out.println("The 10th Fibonacci Number is " + Test.fibo(10));
        skip2();
        System.out.println("The GCF of 120 and 108 is " + Test.gcf(120,108));
        skip2();
        System.out.println("2 raised to the 8th power is " + Test.pow(2,8));
        skip2();
    }
    public static void skip2(){
        System.out.println("\n");
    }
    public static void skip3(){
        System.out.println("\n\n");
    }
}

class Test {
    public static void countUp(int k, int n){
        if(k >= n){ // checks to make sure k is not greater than n
            System.out.print(n); //Just prints the last number
        }else{
            System.out.print(k+" "); //prints k
            countUp(++k,n); // Increases k.
        }
    }
    public static void countDown(int k, int n) {
        if(n <= k){ // makes sure n is not less than k
            System.out.print(k);
        }else{
            System.out.print(n+" ");
            countDown(k,--n);//Subtract 1 from n
        }
    }
    public static int sum(int n){
        if(n == 0){
            return 0; // since we are adding we want to return 0 so that it wont affect the outcome
        }else{
            return n + sum(n-1); // we add n with its previous number plus 1
        }
    }
    public static int fact(int n){
        if(n == 0){
            return 1; // returns 1 so when it is later multiplyed by the number it does not affect it
        }else{
            return n * fact(n-1); // does the same thing as sum except it is multiplying
        }
    }
    public static int fibo(int n){
        if(n == 0){
            return 0; // returns 0 because the 0th place in fib is 0
        }else if(n == 1){
            return 1; // returns 1 because the 1st place in fib is 1
        }else{
            int fibo1 = fibo(n-2); // adds the previous two numbers
            int fibo2 = fibo(n-1);
            return fibo1+fibo2; // and returns it causing the method to go all the way to the start and work its way back.
        }
    }
    public static int gcf(int n1, int n2){
        if(n2 == 0){
            return n1;
        }else{
            return gcf(n2,n1%n2);
            //This statement will keep switching n1 and n2 while also making n2 the remainder because if n2 is 0 that
            //would mean that n1 is the number that goes into both of them evenly.
        }
    }
    public static int pow(int n1, int n2){
        if(n2 == 0){
            return 1;
        }else{
            return n1*pow(n1,--n2);//This method is similar to factorial except instead of changing n1 we just change
            //n2.
        }
    }
}
