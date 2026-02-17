package MultiTHreading;

public class Demon {
    public static void main() {
        Thread d1 = new Thread(() -> {
            while(true){
                try {
                    System.out.println("Demon Thread Working in the Background");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        d1.setDaemon(true);
        d1.start();


            try {
                System.out.println("Main thread is starting its work ......");
                Thread.sleep(2000);
                System.out.println("Mian thread is finished!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println("Main thread is existing !!");

//            d1.start();



    }
}
