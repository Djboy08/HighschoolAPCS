package Unit_5.Lab_4;

public class Cylinder extends Identity {
    private double r,h;
    public Cylinder(){
        this(2,2);
    }
    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
        setString("Cylinder");
    }
    public double volume(){
        return Math.PI*(r*r)*h;
    }
    public double surfaceArea(){
        return (2*Math.PI*r*h)+(2*Math.PI*(r*r));
    }
}
