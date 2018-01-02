import java.util.*;
public class name{
    
    public static String getFirstName(String fullName){
        int index = fullName.indexOf(" ");
        String FirstName = fullName.substring(0,index);
        return FirstName;
    }
    public static String getLastName(String fullName){
        int index = fullName.indexOf(" ");
        String LastName = fullName.substring(index+1);
        return LastName;
    }    
    public static void askName(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name and last name respectivly. --> ");
        String Name = input.nextLine();
        String FirstName = getFirstName(Name);
        String LastName = getLastName(Name);
        System.out.println("First Name First: "+FirstName+" "+LastName);
        System.out.println("Last Name First: "+LastName+", "+FirstName);
        
    }
    public static void main(String args[]){
        askName();
    }
}