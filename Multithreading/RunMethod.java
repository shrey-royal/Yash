public class RunMethod extends Thread {
    
    public void run() {
        // System.out.println("Run method");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
    
    public static void main(String[] args) {
        RunMethod t1 = new RunMethod();
        RunMethod t2 = new RunMethod();
        
        t1.run();
        t2.run();

        // System.out.println("Thread 1: " + t1.getPriority() + " Thread 2: " + t2.getPriority());
    }
}