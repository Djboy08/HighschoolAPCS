package Unit_5.Lab_4;

public class Rectangle extends Identity implements Shape {
    protected double l,w,h;
    public Rectangle(){
        this(2,2,2);
    }
    public Rectangle(double l, double w, double h) {
        super("Rectangle");
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public double volume(){
        return l * w * h;
    }
    public double surfaceArea(){
        return 2*(w*l + h*l + h*w);
    }
    public String toString(){
        return "---"+getName()+"\nVolume: "+volume()+"\nSurface Area: "+surfaceArea()+"\n";
    }
}
