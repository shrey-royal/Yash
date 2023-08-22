/* 
10. Scientific Simulation: Build a simulation software for scientific experiments that require intensive computation. Utilize threads to simulate different aspects of the experiment concurrently, optimizing simulation time.

Test case: 

10. Scientific Simulation:
    - Methods: 'simulateExperiment', 'processResult'
    - Approach: Use threads to simulate different parts of the experiment concurrently. Combine results at the end.
    - Test Cases: 
      - Simulate various aspects of the experiment in parallel.
      - Ensure proper synchronization and result aggregation.

*/

import java.util.concurrent.*;

public class Task10 {
    public static void main(String[] args) {
        int numThreads = 4; // Number of threads for parallel simulation
        int dataSize = 1000; // Size of the data set

        //Create a thread pool with the specified number of threads
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        //Create a shared result container
        double[] result = new double[dataSize];

        //Divide the data set into chunks
        int chunkSize = dataSize / numThreads;

        //Create and submit tasks to the thread pool
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;
            executor.submit(new SimulationTask(start, end, result));
        }

        //Shutdown the thread pool
        executor.shutdown();

        //Wait for the tasks to finish
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);    //it will wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Process the result
        double finalResult = 0.0;
        for(double d : result) {
            finalResult += d;
        }

        //Print the result
        System.out.println("Final result: " + finalResult);
    }
}

class SimulationTask implements Runnable {
    private int start;
    private int end;
    private double[] result;

    public SimulationTask(int start, int end, double[] result) {
        this.start = start;
        this.end = end;
        this.result = result;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            //Simulate some computation on the data
            result[i] = Math.sin(i) + Math.cos(i);
        }
    }
}