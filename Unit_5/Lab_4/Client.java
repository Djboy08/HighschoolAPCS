package Unit_5.Lab_4;
public class Client {
    public static void main(String[] args){
        Cube c = new Cube(5);
        System.out.println(c.volume());
        System.out.println(c.surfaceArea());
        System.out.println("-----------");
        Rectangle r = new Rectangle(2,2,2);
        System.out.println(r.volume());
        System.out.println(r.surfaceArea());
        System.out.println("-----------");
        Circle s = new Circle(5);
        System.out.println(s.volume());
        System.out.println(s.surfaceArea());
        System.out.println("-----------");
    }
}