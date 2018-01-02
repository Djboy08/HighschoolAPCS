public class Time
{
    static int seconds = 10000;
    public static int computeHours()
    {
        return seconds/3600;
    }
    public static int computeSeconds()
    {
        return (seconds%3600)%60;
    }
    public static int computeMinutes()
    {
        return (seconds%3600)/60;
    }
    public static void main(String[] args)
    {
        System.out.print(computeHours()+" Hours, ");
        System.out.print(computeMinutes()+" Minutes, ");
        System.out.print(computeSeconds()+" Seconds.");
    }
}