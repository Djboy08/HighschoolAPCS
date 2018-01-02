public class Singing {

    public static void firstVerse() {
        System.out.println("a partridge in a pear tree.");
    }
    public static void secondVerse() {
        System.out.println("two turtle doves, and");
        firstVerse();
    }
    public static void thirdVerse() {
        System.out.println("three French hens,");
        secondVerse();
    }    
    public static void fourthVerse() {
        System.out.println("four calling birds,");
        thirdVerse();        
    }
    public static void fifthVerse() {
        System.out.println("five gold rings,");
        fourthVerse();     
    }
    public static void sixthVerse() {
        System.out.println("six geese a-laying,");
        fifthVerse();      
    }
    public static void seventhVerse() {
        System.out.println("seven swans a-swimming,");
        sixthVerse();            
    }
    public static void eighthVerse() {
        System.out.println("eight maids a-milking,");
        seventhVerse();          
    }
    public static void ninthVerse() {
        System.out.println("nine ladies dancing,");
        eighthVerse();          
    }
    public static void tenthVerse() {
        System.out.println("ten lords a-leaping,");
        ninthVerse();          
    }
    public static void eleventhVerse() {
        System.out.println("eleven pipers piping,");
        tenthVerse();          
    }
    public static void twelfthVerse() {
        System.out.println("Twelve drummers drumming,");
        eleventhVerse();          
    }
    
    public static void main (String[] args) {
        System.out.println("On the first day of Christmas,");
        System.out.println("my true love sent to me");
        firstVerse();
        System.out.println();
        System.out.println("On the second day of Christmas,");
        System.out.println("my true love sent to me");
        secondVerse();
        System.out.println();
        System.out.println("On the third day of Christmas,");
        System.out.println("my true love sent to me");
        thirdVerse();
        System.out.println();
        System.out.println("On the fourth day of Christmas,");
        System.out.println("my true love sent to me");
        fourthVerse();
        System.out.println();
        System.out.println("On the fifth day of Christmas,");
        System.out.println("my true love sent to me");
        fifthVerse();
        System.out.println();
        System.out.println("On the sixth day of Christmas,");
        System.out.println("my true love sent to me");
        sixthVerse();
        System.out.println();
        System.out.println("On the seventh day of Christmas,");
        System.out.println("my true love sent to me");
        seventhVerse();
        System.out.println();
        System.out.println("On the eighth day of Christmas,");
        System.out.println("my true love sent to me");
        eighthVerse();
        System.out.println();
        System.out.println("On the ninth day of Christmas,");
        System.out.println("my true love sent to me");
        ninthVerse();
        System.out.println();
        System.out.println("On the tenth day of Christmas,");
        System.out.println("my true love sent to me");
        tenthVerse();
        System.out.println();
        System.out.println("On the eleventh day of Christmas,");
        System.out.println("my true love sent to me");
        eleventhVerse();
        System.out.println();
        System.out.println("On the twelfth day of Christmas,");
        System.out.println("my true love sent to me");
        twelfthVerse();
        }
    
}