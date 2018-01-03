package Unit_5.Lab_4;

public class Triangle extends Identity implements Shape {
    private double a,b,c,h;
    public Triangle(){
        this(2,2,2,2);
    }
    public Triangle(double a, double b,double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        setString("Triangle");
    }
    public double volume(){
        return Math.sqrt( (a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c) )*h;
    }
    public double surfaceArea(){
        return (2*Math.sqrt( (a+b+c)/2*((a+b+c)/2-a)*((a+b+c)/2-b)*((a+b+c)/2-c) )+(a+b+c)*h);
    }
    public String toString(){
        return "---"+getName()+"\nVolume: "+volume()+"\nSurface Area: "+surfaceArea()+"\n";
    }
}
