/*

class Table {

    synchronized static void printTable(int n) {    //synchronized method
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
    public void run() {
        Table.printTable(1);
    }
}

class CustomThread2 extends Thread {
    public void run() {
        Table.printTable(10);
    }
}

class CustomThread3 extends Thread {
    public void run() {
        Table.printTable(100);
    }
}

class CustomThread4 extends Thread {
    public void run() {
        Table.printTable(1000);
    }
}


public class StaticSync {
    public static void main(String[] args) {
        CustomThread1 t1 = new CustomThread1();
        CustomThread2 t2 = new CustomThread2();
        CustomThread3 t3 = new CustomThread3();
        CustomThread4 t4 = new CustomThread4();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
*/

/*
Problem without static synchronization:

Suppose there are two objects of a shared class(e.g. Table) named object1 and object2. In case of synchronized method and synchronized block there cannot be interference between t1 and t2 or t3 and t4 because t1 and t2 both refers to a common object that have a single lock. But there can be interference between t1 and t3 or t2 and t4 because t1 acquires another lock and t3 acquires another lock. But if we make a method static, there is no need to acquire any lock.

In simple terms here we are using synchronized keyword with static method. Since static methods are class level methods, they are accessed using class name. So if we make any static method synchronized, it will lock the class and since there is only one class, it will lock the class and hence no other thread will be able to access any static synchronized method of that class.


*/


// Java program of multithreading
// with static synchronized

class Display
{
	public static synchronized void wish(String name)
	{
		for(int i=0;i<3;i++)
		{
			System.out.print("Good Morning: ");
			System.out.println(name);
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

class MyThread extends Thread {
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		Display.wish(name); // static method
	}
}

class StaticSync {
	public static void main(String arg[])
	{
		Display d1=new Display();
		Display d2=new Display();
		MyThread t1=new MyThread(d1,"Dhoni");
		MyThread t2=new MyThread(d2,"Yuvaraj");
		t1.start();
		t2.start();
	}
}
