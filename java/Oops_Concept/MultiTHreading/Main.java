package MultiTHreading;

    public class Main {
        // Added String[] args and the throws declaration
        public static void main(String[] args) throws InterruptedException {
            System.out.println("Start");

            // This prints the name, priority, and group of the current thread
            System.out.println(Thread.currentThread());

//            for(int i = 0; i < 10; i++) {
//                Thread.sleep(500); // Pauses execution for 500ms
//                System.out.println("Hello " + i);
//            }

//            Worker t1 = new Worker();
////            t1.run();   // This will do run only one Thread
//            t1.start();   // This will Trigger MultiThreading
            Thread t1 = new Thread(new Work());
            t1.setName("t1");
            t1.setPriority(Thread.MAX_PRIORITY);
            t1.start();

            Thread t2 = new Thread(new Work());
            t2.setName("t2");
            t2.setPriority(Thread.MIN_PRIORITY);
            t2.start();

          Thread t3 = new Thread(new Work());
          t3.setName("t3");
          t3.setPriority(Thread.NORM_PRIORITY);
          t3.start();

            Thread t4 = new Thread(new Work());
            t4.setName("t4");
            t4.setPriority(2);
            t4.start();





            System.out.println("END");
        }

}
