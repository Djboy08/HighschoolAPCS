package Unit_5.Lab_4;
//The client
public class Client {
    public static void main(String[] args){
        Cube c = new Cube(5);
        Rectangle r = new Rectangle(2,2,2);
        Sphere s = new Sphere(5);
        Triangle t = new Triangle(2,2,2,2);
        Cylinder cy = new Cylinder(2,2);

        System.out.println(c);
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
        System.out.println(cy);
    }
}