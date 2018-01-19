package Unit_5.Lab_1;
public class client {
    public static void main(String args[]){
        AdvancedStudentTicket t = new AdvancedStudentTicket(1,11);
        System.out.println(t);
        AdvancedTicket z = new AdvancedTicket(1,11);
        System.out.println(z);
        WalkupTicket x = new WalkupTicket(1);
        System.out.println(x);
    }
}