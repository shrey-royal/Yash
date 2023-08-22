// public class Thread_Group implements Runnable {

//     public void run() {
//         System.out.println(Thread.currentThread().getName());
//     }

//     public static void main(String[] args) {
//         Thread_Group runnable = new Thread_Group();
//         ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");

//         // Thread(ThreadGroup name, Runnable target, String name)
//         Thread t1 = new Thread(tg, runnable, "one");
//         t1.start();
//         Thread t2 = new Thread(tg, runnable, "two");
//         t2.start();
        
//         Thread t3 = new Thread(tg, runnable, "three");
//         t3.start();
        
//         System.out.println("Thread Group Name: " + tg.getName());
//         tg.list();  // prints information about this thread group to the standard output
//     }
// }


class CreateNew extends Thread {
    CreateNew(String tname, ThreadGroup tg) {
        super(tg, tname);
        start();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " finished executing");
    }
}

public class Thread_Group {
    public static void main(String[] args) {
        ThreadGroup parent = new ThreadGroup("Parent ThreadGroup");
        ThreadGroup child = new ThreadGroup(parent, "Child ThreadGroup");

        CreateNew th1 = new CreateNew("Yash", parent);
        System.out.println("Starting parent thread");
        CreateNew th2 = new CreateNew("Yashvi", child);
        System.out.println("Starting child thread");

        System.out.println("Active threads in parent thread group: " + parent.activeCount());
    }
}
