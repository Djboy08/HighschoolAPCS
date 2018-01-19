package Unit_5.Lab_1;
public class Ticket {
    private int number;
    private double price;
    public Ticket(){
        number = 0;
    }
    public Ticket(int number){
        setNumber(number);
    }
    public double getPrice(){
        return price;
    }
    public int getNumber(){
        return number;
    }    
    public void setNumber(int num){
        this.number = num;
    }
    public void setPrice(int num){
        this.price = num;
    }    
    public String toString(){
        return("Number: "+number+", Price: "+price);
    }
}
