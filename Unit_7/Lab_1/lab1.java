package Unit_7.Lab_1;

public class lab1 {
    public static void main(String args[]){
        System.out.println(test.fibo(10));
    }
}

class test {
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

}
