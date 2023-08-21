public class NamingThread extends Thread {
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " -> Why are you running?");
    }
    
    public static void main(String[] args) {
        NamingThread t1 = new NamingThread();
        NamingThread t2 = new NamingThread();

        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());

        t1.start();
        t2.start();

        t1.setName("Yash");
        t2.setName("Yashvi");

        System.out.println("After changing name of t1: " + t1.getName());
        System.out.println("After changing name of t2: " + t2.getName());
    }
}
