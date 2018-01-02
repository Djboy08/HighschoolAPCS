public class ForLoop{
    
    public static void Loop1(){
        //start 2 : stop 90 : increment 5
        //2 7 12 17 22 27 32 37 42 47 52 57 62 67 72 77 82 87
        for(int i=2;i<=90;i+=5){
            System.out.print(i+" ");   
        }
        System.out.println();
    }

    public static void Loop2(){
        //start 3 : stop 76 : increment 4
        //3 7 11 15 19 23 27 31 35 39 43 47 51 55 59 63 67 71 75
        for(int i=3;i<=76;i+=4){
            System.out.print(i+" ");   
        }
        System.out.println();
    }   
    public static void Loop3(){
        //start -10 : stop 8 : increment 2
        //-10 -8 -6 -4 -2 0 2 4 6
        for(int i=-10;i<=6;i+=2){
            System.out.print(i+" ");   
        }
        System.out.println();
    } 

    public static void Loop4(){
       //start 5 : stop 30 : increment 2
       //5 7 9 11 13 15 17 19 21 23 25 27 29
        for(int i=5;i<=30;i+=2){
            System.out.print(i+" ");   
        }
        System.out.println();
    } 

    public static void Loop5(){
        //start 100 : stop 150 : increment 5
        //100 105 110 115 120 125 130 135 140 145
        for(int i=100;i<=145;i+=5){
            System.out.print(i+" ");   
        }
        System.out.println();
    }     
    
    public static void main(String args[]){
        Loop1();
        Loop2();
        Loop3();
        Loop4();
        Loop5();
    }
}