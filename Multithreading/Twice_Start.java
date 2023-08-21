public class Twice_Start {
    public static void main(String[] args) {
        // Thread t1 = new Thread();
        // t1.start(); // here the state of thread is Runnable
        // t1.start(); // here the state of thread is IllegalThreadStateException

        Thread t2 = new Thread();
        t2.run(); // this will work fine but it will not create a new thread instead it will run on the main thread
    }
}
/*

What if we call Java run() method directly instead start() method?

> Each thread starts in a separate call stack.
> Invoking the run() method from the main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.

*/