package MultiTHreading.Advance;

public class DeadLockExample {
    public static void main() {
        final String resources1 = "Bowl";
        final String resources2 ="Spoon";

        Thread t1 = new Thread (() ->{
            synchronized (resources1){
                System.out.println("Thread 1 : Locked" + resources1);
                try{
                    Thread.sleep(100);
                }catch (Exception e){

                }
                System.out.println("thread 1 : Waiting for "+ resources2+ "....");
                synchronized (resources2){
                    System.out.println("thread 1 Locked both");
                }
            }
        });
        Thread t2 = new Thread (() ->{
            synchronized (resources1){
                System.out.println("Thread 2 : Locked" + resources1);
                try{
                    Thread.sleep(100);
                }catch (Exception e){

                }
                System.out.println("thread 2 : Waiting for "+ resources2+ "....");
                synchronized (resources2){
                    System.out.println("thread 2 Locked both");
                }
            }
        });
    t1.start();
    t2.start();

    }
}
