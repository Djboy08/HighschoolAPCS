package Unit_5.Lab_4;

public class Cube extends Rectangle {
    public Cube(){
        this(2);
    }
    public Cube(double size){
        setString("Cube");
        this.l = size;
    }
    public double volume(){
        return Math.pow(this.l,3);
    }
    public double surfaceArea(){
        return 6*(Math.pow(this.l,2));
    }
}
