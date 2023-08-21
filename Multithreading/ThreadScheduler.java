public class ThreadScheduler {
    public static void main(String[] args) {
        Thread t1 = new Thread("t1");
        Thread t2 = new Thread("t2");
        Thread t3 = new Thread("t3");
        Thread t4 = new Thread("t4");

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);
        t4.setPriority(5);

        System.out.println("t1 priority: " + t1.getPriority());
        System.out.println("t2 priority: " + t2.getPriority());
        System.out.println("t3 priority: " + t3.getPriority());
        System.out.println("t4 priority: " + t4.getPriority());
        
    }
}

/*
Thread Scheduling is the process of selecting the thread to be executed next on the CPU. 

There are 2 factors that affect the thread scheduling:
1. Priority: Every thread has a priority that helps the operating system determine the order in which threads are scheduled. 
    The thread with the highest priority is scheduled first. 
    The default priority of a thread is 5 (normal priority). 
    The minimum priority is 1 and the maximum priority is 10. 
    You can change the priority of a thread using the setPriority() method.

2. Arrival Time: When the priority of 2 threads is the same, the operating system schedules the thread that arrived first. 
    The arrival time is the time when the thread was created. 
    You can get the arrival time of a thread using the getPriority() method.

Thread Scheduling Algorithms:
    1. First Come First Serve (FCFS): The thread that arrives first is scheduled first.
    2. Time Slicing: Each thread is assigned a fixed time slice. 
        When a thread is scheduled, it is allowed to run for that time slice. 
        When the time slice expires, the thread is preempted and the next thread is scheduled.
    3. Priority Based Scheduling: The thread with the highest priority is scheduled first. 
        If 2 threads have the same priority, the thread that arrived first is scheduled first.
*/