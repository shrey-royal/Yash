/*
Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection.

Properties:
1. It provides services to user threads for background supporting tasks.
2. It has no role in life than to serve user threads.
3. Its life depends on user threads.
4. It is a low priority thread.

Methods for Java Daemon Thread:
1. public void setDaemon(boolean status): is used to mark the current thread as daemon thread or user thread.
2. public boolean isDaemon(): is used to check that current is daemon.
*/

public class DaemonThread extends Thread {

    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running");
        } else {
            System.out.println("User thread is running");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
        DaemonThread t3 = new DaemonThread();

        t1.setDaemon(true);//now t1 is daemon thread
        
        t1.start();
        t2.start();
        t3.start();
    }
}