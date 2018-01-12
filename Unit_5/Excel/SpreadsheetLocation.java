package Unit_5.Excel;


//Update this file with your own code.

public class SpreadsheetLocation implements Location {
    private String s = "";
    public int getRow(){
        // TODO Auto-generated method  stub
        return Integer.parseInt(s.substring(1))-1;
    }

    public int getCol(){
        // TODO Auto-generated method stub
        String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L"};
        String temp = s.substring(0,1);
        for(int i = 0;i<=alpha.length-1;i++){
            if(temp.equalsIgnoreCase(alpha[i])){
                return i;
            }
        }
        return 0;
    }

    public SpreadsheetLocation(String cellName){
        // TODO: Fill this out with your own code
        s = cellName;
    }

}