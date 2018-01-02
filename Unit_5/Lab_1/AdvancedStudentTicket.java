public class AdvancedStudentTicket extends AdvancedTicket{
    private int ID;
    public AdvancedStudentTicket(int n, int days){
        setNumber(n);
        if(days > 10 ){
            setPrice(15);   
        }else{
            setPrice(20);
        }
    }
    public String toString(){
        return("Number: "+getNumber()+", Price: "+getPrice()+" (ID REQUIRED)");
    }
}
