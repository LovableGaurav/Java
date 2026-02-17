package MultiTHreading;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello" + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
//        t1.join();

//        Worker t2= new Worker();
//        t2.start();
//        t2.join();

        t1.join();

        Thread.sleep(2000);
        System.out.println(t1.getState());
//        System.out.println(t2.getState());
        Thread.sleep(500);
        System.out.println("END" + Thread.currentThread());
    }
}
