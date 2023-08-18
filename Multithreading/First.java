// we can use thread by extending Thread class or implementing Runnable interface

// class First extends Thread {
//     public void run() {
//         System.out.println("Thread is running");
//     }


//     public static void main(String[] args) {
//         First t1 = new First();
//         t1.start();
//     }
// }

// class First implements Runnable {
//     public void run() {
//         System.out.println("Thread is running");
//     }

//     public static void main(String[] args) {
//         First obj = new First();
//         // we can also write Thread t1 = new Thread(new First());
//         Thread t1 = new Thread(obj);    //using the constructor Thread(Runnable r)
//         t1.start();
//     }
// }

// public class First {
//     public static void main(String[] args) {
//         Thread t1 = new Thread("Thread 1");
//         System.out.println(t1.getName());
//         t1.start();
//         try {
//             Thread.sleep(-1000);
//         } catch (InterruptedException e) {
//             System.out.println(e);
//         } catch (IllegalArgumentException e) {
//             System.out.println(e);
//         }
//         System.out.println(t1.getName());
//     }
// }

//can we start a thread twice
// public class First {
//     public static void main(String[] args) {
//         Thread t1 = new Thread("Thread 1");

//         t1.start();
//         t1.start(); //java.lang.IllegalThreadStateException: Thread already started
//     }
// }

// What if we call Java run() method directly instead start() method?
public class First {
    public static void main(String[] args) {
        Thread t1 = new Thread("Thread 1");
        t1.run(); //no new thread will be created
        System.out.println(t1.getName());
    }
}
/*
 * Here we are calling run() method directly, so no new thread will be created and run() method will be executed as a normal method call.
 */