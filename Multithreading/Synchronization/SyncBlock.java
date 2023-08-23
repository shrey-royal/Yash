class Table {
    void printTable(int n) {
        synchronized(this) {
            System.out.println("Synchronized block");
            for (int i = 1; i < 10; i++) {
                System.out.print("[" + Thread.currentThread().getName() + "] ");
                System.out.println(n + " x " + i + " = " + n*i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        //rest of the code in the method
        System.out.println("Rest of the code (not synchronized))");
        n++;
        for (int i = 1; i < 10; i++) {
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

public class SyncBlock {
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
> Synchronized block can be used to perform synchronization on any specific resource of the method.

> Suppose you have 50 lines of code in your method, but you want to synchronize only 5 lines, you can use synchronized block.
*/