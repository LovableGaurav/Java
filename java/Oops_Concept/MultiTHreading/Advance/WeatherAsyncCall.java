package MultiTHreading.Advance;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WeatherAsyncCall {
    public static void main(String[] args) {

        // Define a thread pool size
        ExecutorService executor = Executors.newFixedThreadPool(3);

        String lat = "40.7128";
        String lng = "-74.0060";

        String url = String.format(
                "https://api.open-meteo.com/v1/forecast?latitude=%s&longitude=%s&current_weather=true",
                lat, lng
        );

        System.out.println("Fetching weather for: " + url);

        // Start the async task
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                    try {
                        getWeather(url);
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException("Failed to fetch weather", e);
                    }
                }, executor)
                .whenComplete((result, ex) ->executor.shutdown());

                        System.out.println("Async task completed successfully.");

                    // Shut down the executor so the program can exit

        // Main thread continues doing other things
        System.out.println("Main thread is free to do other work...");
    }

    static void getWeather(String url) throws IOException, InterruptedException {
        // HttpClient implements AutoCloseable in newer Java versions,
        // but typically you reuse one client instance.
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url)) // URI.create is used for strings
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString() // Fixed BodyHandlers name
            );

            System.out.println("\n--- Weather API Response ---");
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Body: " + response.body());
        }
    }
}