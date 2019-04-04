package bean;
public class Counter {        
    public Counter() {
    }
    private int Count=0;
    public void setCounter(int count){
        Count=count;
    }
    public int getCounter(){
        return ++Count;
    }     
}	
