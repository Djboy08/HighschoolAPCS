package Unit_5.Lab_2;
public class Client {
    public static void main(String args[]){
        int[] ar = {70,70,90,100,20,60};
        int[] ar2 = {70,70,90,100,40,70};
        Student[] Students ={
                        new Student(),
                        new Student("Justin",ar),
                        new Undergraduate(),
                        new Undergraduate("Andres",ar2),
                        new Graduate(),
                        new Graduate("Josh",ar,15)
        };
        for(Student s : Students){
            s.computeGrade();
            System.out.println(s.getName() + " - average: "+s.getTestAverage()+" and grade is : "+s.getGrade());
        }
    }
}