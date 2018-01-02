public class TimeHundredVersion
{
    static int seconds = 10000123;
    public static int computeHours()
    {
        return (seconds/1000)/3600;
    }
    public static int computeSeconds()
    {
        return ((seconds/1000)%3600)%60;
    }
    public static int computeMiliseconds()
    {
        return (seconds)%1000;
    }    
    public static int computeMinutes()
    {
        return ((seconds/1000)%3600)/60;
    }
    public static void main(String[] args)
    {
        System.out.println("Starting miliseconds: "+seconds);
        System.out.print(computeHours()+" Hours, ");
        System.out.print(computeMinutes()+" Minutes, ");
        System.out.print(computeSeconds()+" Seconds, ");
        System.out.print(computeMiliseconds()+" Miliseconds.");
    }
}