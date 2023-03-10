package Main;
//the worst thing about threads is the state of inconsistency

//what is the state of inconsistency: when two threads try access to the same resource
//by modifying it, this one looses the original value, assuming inconstancy value, assumings a different
//value for each thread

// WHY WE USE SYNCHRONIZATION:
//data inconsistency
//data integrity: don't create errors
//to work with a shared resource

//disadvantages: performance

public class Main {
    public static void main(String[] args) {
//        MyThread t=new MyThread();
//        t.start();
//        System.out.println("counter: "+t.count);
        Incrementer i=new Incrementer();
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    i.Increment();

                }
            }
        });
        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000; j++) {
                    i.Increment();

                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(i.counter);
    }
}
