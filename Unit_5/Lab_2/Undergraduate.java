package Unit_5.Lab_2;
public class Undergraduate extends Student{
    public Undergraduate(){
        super();
    }
    public Undergraduate(String Name,int[] array){
        super(Name,array);
    }
    public void computeGrade(){
        setGrade( getName() != "" ? ( getTestAverage() >= 70 ? "Pass" : "Fail" ) : "There is no student");
    }
}