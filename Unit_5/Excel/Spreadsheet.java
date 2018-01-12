package Unit_5.Excel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
    Cell[][] sheet = new Cell[12][20];
    public Spreadsheet(){

    }
    @Override
    public String processCommand(String command){
        // TODO Auto-generated method stub
        return null;
    }

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

        return null;
    }

    @Override
    public String getGridText(){
        // TODO Auto-generated method stub
        return null;
    }

}