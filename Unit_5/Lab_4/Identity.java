package Unit_5.Lab_4;

public abstract class Identity implements Shape
{
    private String s;
    public Identity(){
        this.s = "Error";
    }
    public Identity(String s){
        this.s = s;
    }
    public void setString(String s){
        this.s = s;
    }
    public String getName(){
        return s;
    }
    public String toString(){
        return  "---"+getName()+"\nVolume: "+volume()+"\nSurface Area: "+surfaceArea()+"\n";
    }
}
