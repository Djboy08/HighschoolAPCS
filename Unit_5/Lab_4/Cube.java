package Unit_5.Lab_4;

public class Cube implements Shape {
    private double size;
    public Cube(double size){
        this.size = size;
    }
    public double volume(){
        return Math.pow(this.size,3);
    }
    public double surfaceArea(){
        return 6*(Math.pow(this.size,2));
    }
}
