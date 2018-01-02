public class AdvancedTicket extends Ticket{
    public AdvancedTicket(){
        
    }
    public AdvancedTicket(int n, int days){
        setNumber(n);
        if(days > 10 ){
            setPrice(30);   
        }else{
            setPrice(40);
        }
    }
}
