
//Understanding the problem without synchronization

class Table {
    // void printTable(int n) {    //non synchronized method
    //     for (int i = 1; i < 10; i++) {
    //         System.out.print(Thread.currentThread().getName() + "-> ");
    //         System.out.println(n + " x " + i + " = " + n*i);
    //         try {
    //             Thread.sleep(400);
    //         } catch (Exception e) {
    //             System.out.println(e);
    //         }
    //     }
    // }

    synchronized void printTable(int n) {    //synchronized method
        for (int i = 1; i < 10; i++) {
            System.out.print(Thread.currentThread().getName() + "-> ");
            System.out.println(n + " x " + i + " = " + n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class CustomThread1 extends Thread {
    Table t;
    CustomThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

class CustomThread2 extends Thread {
    Table t;
    CustomThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}

public class SyncMethod {
    public static void main(String[] args) {
        Table obj = new Table();
        CustomThread1 t1 = new CustomThread1(obj);
        CustomThread2 t2 = new CustomThread2(obj);
        t1.setName("Yash");
        t2.setName("Yashvi");
        t1.start();
        t2.start();
    }
}

/*
Synchronization in Java is the capability to control the access of multiple threads to any shared resource.
Java Synchronization is better option where we want to allow only one thread to access the shared resource.

Why use Synchronization?
> To prevent thread interference.
> To prevent consistency problem.

Types of Synchronization
> Process Synchronization
> Thread Synchronization

> Thread Synchronization:
Thread Synchronization is used to prevent thread interference and consistency problem.
Types of Thread Synchronization:
> By Synchronized Method
> By Synchronized Block
> By Static Synchronization



*/