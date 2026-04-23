package Test4;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ActivityAggregator {
    // Shared thread-safe map
    private final ConcurrentHashMap<String, Integer> userActivityMap = new ConcurrentHashMap<>();

    public void addActivity(String userId) {
        // Atomic update: if key exists, increment; else set to 1
        userActivityMap.merge(userId, 1, Integer::sum);
    }

    public Map<String, Integer> getResults() {
        return userActivityMap;
    }
}
