public class Graduate extends Student {
    private int gradID;
    
    public Graduate(){
        super();
        this.gradID = 0;
    }
    public Graduate(String Name,int[] array,int GradID){
        super(Name,array);
        this.gradID = GradID;
    }
    public int getID(){
        return this.gradID;
    }
    public void computeGrade(){
        setGrade(getName() != "" ? ( getTestAverage() >= 90 ? "Pass with distinction" : "Fail" ) : "There is no student");
    }    
}