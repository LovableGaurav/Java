package MultiTHreading.Advance;

import java.util.concurrent.*;

public class CollableExample {
    public static void main() throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Double> heavyTask = () ->
        {
            double sum =0;
            System.out.println("Computational Started in Background ....");
            for(int i =0;i<10_00_00_00;i++){
                sum +=Math.sqrt(i);
            }
            Thread.sleep(1000);
            return sum;
        };

        Future<Double> future = executor.submit(heavyTask);
        System.out.println("main thread : i'm blocked  ! I can print this immedieatly.");

        Double total = future.get();

        System.out.println("Computational Complete ! Total Sum: "+total);
        executor.shutdown();
    }
}
