public class Value {
    private int value;
    private int counter;
    public Value(int value,int counter){
        this.value = value;
        this.counter = counter;
    }
    public int getValue(){
        return this.value;
    }
    public int getCounter(){
        return this.counter;
    }
    public void increment(){
        this.counter++;
    }
}