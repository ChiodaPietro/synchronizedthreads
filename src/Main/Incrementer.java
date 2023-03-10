package Main;

public class Incrementer {
    public int counter=0;
    synchronized public void Increment(){
        counter++;
    }
}
