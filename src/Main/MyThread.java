package Main;

public class MyThread extends Thread {
    public int count = 0;

    public void run() {
        incrementCount();
        System.out.println("counter in the thread: " + count);
    }

    public void incrementCount() {
        count++;
    }
}
