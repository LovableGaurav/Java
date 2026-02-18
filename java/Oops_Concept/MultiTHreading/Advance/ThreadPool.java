package MultiTHreading.Advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i =0;i<=100;i++){
            int taskid = i;
            executor.submit(() -> {
                String threadname = Thread.currentThread().getName();
                System.out.println("Task " + taskid+"is being executed by "+threadname);

                try{
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            });
        }

    executor.shutdown();
}}
