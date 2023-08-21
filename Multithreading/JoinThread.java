public class JoinThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(300);
                System.out.println("The Current Thread is: " + Thread.currentThread().getName());
            } catch (Exception e) {
                System.out.println("The exception has been caught : " + e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        JoinThread t1 = new JoinThread();
        JoinThread t2 = new JoinThread();
        JoinThread t3 = new JoinThread();

        t1.setName("First Thread");
        t2.setName("Second Thread");
        t3.setName("Third Thread");

        // Start first thread
        t1.start();

        // Start second thread after waiting for 2 seconds or if it's dead
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t1.join(2000);
        } catch (Exception e) {
            System.out.println("The exception has been caught : " + e);
        }
        t2.start();

        // Start third thread only when first thread is dead
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join(2000);
        } catch (Exception e) {
            System.out.println("The exception has been caught : " + e);
        }
        t3.start();

        // Displaying a message once third thread is dead
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t3.join();
        } catch (Exception e) {
            System.out.println("The exception has been caught : " + e);
        }


    }
}
/*

Joining Threads
> The join() method allows one thread to wait for the completion of another.
> If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is terminated before the next instruction is executed by the program.

*/