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
        if(k >= n){
            System.out.print(n);
        }else{
            System.out.print(k+" ");
            countUp(++k,n);
        }
    }
    public static void countDown(int k, int n) {
        if(n <= k){
            System.out.print(k);
        }else{
            System.out.print(n+" ");
            countDown(k,--n);
        }
    }
    public static int sum(int n){
        if(n == 0){
            return 0;
        }else{
            return n + sum(n-1);
        }
    }
    public static int fact(int n){
        if(n == 0){
            return 1;
        }else{
            return n * fact(n-1);
        }
    }
    public static int fibo(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            int fibo1 = fibo(n-2);
            int fibo2 = fibo(n-1);
            return fibo1+fibo2;
        }
    }
    public static int gcf(int n1, int n2){
        if(n2 == 0){
            return n1;
        }else{
            return gcf(n2,n1%n2);
        }
    }
    public static int pow(int n1, int n2){
        if(n2 == 0){
            return 1;
        }else{
            return n1*pow(n1,--n2);
        }
    }
}
