package MultiTHreading;

public class Work extends Thread {
    public void run() {
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500); // Pauses execution for 500ms
                System.out.println("Hello " + i + "from" + Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
