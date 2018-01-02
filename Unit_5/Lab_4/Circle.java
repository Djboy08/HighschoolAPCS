package Unit_5.Lab_4;

public class Circle implements Shape {
    private double r;
    public Circle(double r){
        this.r = r;
    }
    public double volume(){
        return (4/3)*Math.PI*(Math.pow(r,3));
    }
    public double surfaceArea(){
        return 4*(Math.PI*(Math.pow(r,2)));
    }
}
