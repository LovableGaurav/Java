package Test4;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File logDir = new File("logs");
        File[] logFiles = logDir.listFiles((dir, name) -> name.endsWith(".txt"));

        if (logFiles == null || logFiles.length == 0) {
            System.out.println("No log files found in /logs directory.");
            return;
        }

        ActivityAggregator aggregator = new ActivityAggregator();
        List<Thread> threads = new ArrayList<>();

        // Step 1 & 2: Create and Start Threads
        for (File file : logFiles) {
            Thread thread = new Thread(new LogProcessor(file, aggregator));
            threads.add(thread);
            thread.start();
        }

        // Step 3: Wait for all threads to finish (Join)
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Step 4: Generate Report
        generateReport(aggregator.getResults());
    }

    private static void generateReport(Map<String, Integer> results) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("report.txt"))) {
            writer.println("===== USER ACTIVITY REPORT =====");

            // Bonus: Sort by activity (descending)
            results.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(entry -> {
                        writer.println(entry.getKey() + ": " + entry.getValue() + " actions");
                        System.out.println(entry.getKey() + ": " + entry.getValue() + " actions");
                    });

            System.out.println("\nReport generated successfully in report.txt");
        } catch (IOException e) {
            System.err.println("Error writing report: " + e.getMessage());
        }
    }
}
