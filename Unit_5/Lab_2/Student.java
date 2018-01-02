public class Student{
    private String name,grade;
    private int[] tests;
    public final static int NUM_TESTS=3;
    
    public Student(){
        this.name = "";
        setGrade("");
        tests = new int[NUM_TESTS];
    }
    public Student(String Name,int[] array){
        this.name = Name;
        tests = array;
    }
    public void setGrade(String newGrade){
        this.grade = newGrade;
    }
    public String getName(){
        return this.name;
    }
    public String getGrade(){
        return this.grade;
    }
    public double getTestAverage(){
        int sum = 0;
        for(int i=0;i<=tests.length-1;i++){
            sum+=tests[i];
        }
        return sum/tests.length;
    }
    public void computeGrade(){
        setGrade(getName() != "" ? ( getTestAverage() >= 65 ? "Pass" : "Fail" ) : "There is no student");
    }
    
}