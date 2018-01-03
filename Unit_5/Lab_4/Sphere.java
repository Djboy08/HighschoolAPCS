package Unit_5.Lab_4;

public class Sphere extends Identity {
    private double r;
    public Sphere(double r){
        super("Sphere");
        this.r = r;
    }
    public double volume(){
        return (4/3)*Math.PI*(Math.pow(r,3));
    }
    public double surfaceArea(){
        return 4*(Math.PI*(Math.pow(r,2)));
    }
}
