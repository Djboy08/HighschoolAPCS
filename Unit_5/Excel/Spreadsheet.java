package Unit_5.Excel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
    Cell[][] sheet = new Cell[20][12];
    public Spreadsheet(){
        for(int i = 0;i<=sheet.length-1;i++){
            for(int k = 0;k<=sheet[i].length-1;k++){
                sheet[i][k] = new EmptyCell();
            }
        }
    }
    @Override
    public String processCommand(String command){
        // TODO Auto-generated method stub
        return "";
    }
//
    @Override
    public int getRows(){
        // TODO Auto-generated method stub
        return sheet.length;
    }

    @Override
    public int getCols(){
        // TODO Auto-generated method stub
        return sheet[0].length;
    }

    @Override
    public Cell getCell(Location loc){
        return sheet[loc.getRow()-1][loc.getCol()-1];
    }

    @Override
    public String getGridText(){
        // TODO Auto-generated method stub
        return null;
    }

}