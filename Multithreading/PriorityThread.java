public class PriorityThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> " + Thread.currentThread().getPriority());;
    }


    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        
        t1.start();
        t2.start();
        
        t1.setName("First Thread");
        t2.setName("Second Thread");
        
        t1.setPriority(6);
        t2.setPriority(9);

        System.out.println(t1.getName() + " -> " + t1.getPriority());

        System.out.println(t2.getName() + " -> " + t2.getPriority());

    }
}
/*
Thread Priority:

In java We have 10 priority levels ranging from 1 to 10.
1 is the lowest priority and 10 is the highest priority.
By default every thread will get 5 priority.
We can get and set the priority by using the following methods of Thread class.
public final void setPriority(int p);
public final int getPriority();

we also have 3 constants in Thread class to define priority.
public static final int MIN_PRIORITY = 1;
public static final int NORM_PRIORITY = 5;
public static final int MAX_PRIORITY = 10;



*/